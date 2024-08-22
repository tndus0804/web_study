package com.dsa.web3.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dsa.web3.dto.MemberDTO;
import com.dsa.web3.service.MemberService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService service;
	
	/**
	 * 로그인 폼으로 이동
	 * @return loginForm.html
	 */
	@GetMapping("login")
	public String login() {
		// templates 패키지로부터 html 을 찾는다.
		return "member/loginForm";
	}
	
	/**
	 * 로그인 처리
	 * @param id
	 * @param pw
	 * @param HttpSession 객체
	 * @return home.html
	 */
	@PostMapping("login")
	public String login(
			@RequestParam(name = "id") String id,
			@RequestParam(name = "pw") String pw,
			HttpSession session
		) {
		// id 값을 파라미터로 DB에 회원정보가 존재하는지를 판별
		MemberDTO member = service.selectData(id);
		
		if(member != null) {
			// 만약 입력 정보가 DB에 존재 한다면 패스원드가 일치하는지 판별
			if(member.getPw().equals(pw)) {
				// 일치한 정보일 경우 session 객체에 저장
				session.setAttribute("loginId", member.getId());
				session.setAttribute("loginMember", member);
				
				String currentId = (String) session.getAttribute("loginId");
				log.debug("현재 로그인한 ID: {}", currentId);
				return "redirect:/";
			}else {
				// 비밀번호가 일치하지 않을 경우
				log.debug("로그인 비밀번호가 일치하지 않습니다.");
				return "member/loginForm";
			}
		} else {
			log.debug("로그인 실패! DB에 저장된 회원정보가 없음");
			return "member/loginForm";
		}
		
		
		/*
		나의 코드 1 
		if(member == null) {
			return "redirect:/member/login";
		} else if(!member.getPw().equals(pw)) {
			return "redirect:/member/login";
		}
		*/
		
		/*
		// 나의 코드 2
		MemberEntity result =  service.loginMember(id, pw);
		if(result == null) {
			log.debug("존재하지 않는 id 입니다!");
			return "redirect:/member/login";
		} else if(!result.getPw().equals(pw)) {
			log.debug("비밀번호를 확인해주세요");
			return "redirect:/member/login";
		}
			

		log.debug("로그인 성공");
		session.setAttribute("loginMember", result);
		
		return "redirect:/";
		 */
	}
	
	/**
	 * 로그아웃 처리
	 * @param HttpSession
	 * @return home.html
	 */
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginMember");
		session.removeAttribute("loginId");
		
		String sessionId = (String) session.getAttribute("loginId");
		log.debug("로그아웃, 현재 세션 정보: {}", sessionId);
		return "redirect:/";
	}
	
	/**
	 * 회원가입 폼으로 이동
	 * @return joinForm.html
	 */
	@GetMapping("join")
	public String join() {
		return "member/joinForm";
	}
	
	/**
	 * 회원가입 처리
	 * @param member
	 * @return home.html
	 */
	@PostMapping("join")
//	public String join(
//			@RequestParam(name = "id") String id,
//			@RequestParam(name = "pw") String pw,
//			@RequestParam(name = "name") String name,
//			@RequestParam(name = "phone") String phone,
//			@RequestParam(name = "address") String address
//		) // 이렇게 사용해도 됨
	public String join(@ModelAttribute MemberDTO member) {
		// @ModelAttribute 메서드 파라미터에 사용하며, 요청 파라미터를 객체에 바인딩
//		log.debug("join 아이디: {} 비밀번호: {} 이름: {} 전화번호: {} 주소: {}", id, pw, name, phone, address);
		log.debug("[MemberController-join] member: {}", member);
		
//		MemberDTO member = new MemberDTO(id, pw, name, phone, address);
		service.joinData(member);
		log.debug("회원가입 성공!");
		
		
		return "redirect:/";
	}
	
	/**
	 * 정보 수정 폼으로 이동
	 * @return updateForm.html
	 */
	@GetMapping("update")
	public String update(HttpSession session, Model model) {
		// 로그인한 유저의 id를 세션객체로부터 불러오기
		String id = (String) session.getAttribute("loginId");
		// id 값에 일치하는 DB 회원정보를 자바객체로 가져오기
		MemberDTO member = service.selectData(id);
		// HTML에 출력하기 위해서 model객체에 해당 객체 저장
		model.addAttribute("member", member);
		if(member == null) {
			log.debug("없음");
			return "redirect:/";
		}
		return "member/updateForm";
	}
	
	/**
	 * 정보 수정 처리
	 * @param member
	 * @return home.html
	 */
	@PostMapping("update")
	public String update(@ModelAttribute MemberDTO member) {
		log.debug("[MemberController-update] member: {}", member);
//		service.updateData(member);
//		return "member/updateForm.html";
		return "redirect:/";
	}
	
	/**
	 * 회원정보조회 폼으로 이동
	 * @return selectForm.html
	 */
	@GetMapping("select")
	public String select() {
		return "member/selectForm";
	}
	
	/**
	 * 검색폼에서 입력한 아이디를 전달받아 회원정보 조회 처리
	 * @param searchId
	 * @param Model
	 * @return select.html
	 */
	@PostMapping("select")
	public String select(
			@RequestParam(name = "searchId") String searchId,
			Model model
		) {
		MemberDTO member = service.selectData(searchId);
		
		if(member == null) {
			log.debug("select - 회원 없음");
		} else {
			log.debug("select - 회원 있음");
			
		}
		
		model.addAttribute("member", member);
		model.addAttribute("searchId", searchId);
		
	
		
		return "member/select";
	}
	
	/**
	 * url로부터 들어온 요청경로를 처리하는 메서드
	 * http://localhost:9993/web3/member/info/"abc" 형식으로 요청
	 * @param id
	 * @param model
	 * @return select.html
	 */
	@GetMapping("info"+"/{id}")
	public String info(
			// 요청 URL의 일부를 메서드 파라미터로 매핑
			@PathVariable(name="id") String id, 
			Model model
		) {
		MemberDTO member = service.selectData(id);
		model.addAttribute("member", member);
		model.addAttribute("searchId", id);
		
		return "member/select";
	}
	/**
	 * 회원정보 전체조회
	 * @param Model
	 * @return list.html
	 */
	@GetMapping("list")
	public String list(Model model) {
		
		List<MemberDTO> list = service.selectAll();
		model.addAttribute("list", list);
		log.debug("회원의 수는 {}명", list.size());
		
		return "member/list";
	}
	/**
	 * 회원 삭제
	 */
	@PostMapping("delete/{id}")
	public String delete(
				@PathVariable("id") String id, RedirectAttributes redirectAttribute
			) {
//		service.deleteMemberById(id);
		boolean result = service.deleteData(id);
		if(result) {
			log.debug("{} 삭제 완료", id);
		} else {
			log.debug("삭제 실패");
		}
		
		return "redirect:/member/list";
	}
	
	/**
	 * 회원정보 삭제 처리 2
	 * @param id
	 * @return 
	 */
	@GetMapping("delete")
	public String delete(@RequestParam(name = "id") String id) {
		log.debug("삭제처리하기 위해 받아온 id: {}", id);
		
		boolean result = service.deleteData(id);
		
		log.debug("삭제처리 : {}", (result ? "성공" : "실패"));
		
		return "redirect:/member/list";
	}
	

}
