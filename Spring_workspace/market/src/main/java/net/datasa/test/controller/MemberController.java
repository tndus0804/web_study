package net.datasa.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 회원 관련 콘트롤러
 */

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("member")
public class MemberController {
	
	private final MemberService memberService;
	
	/**
    * 회원가입 페이지로 이동
    * @return joinForm.html
    */
	@GetMapping("join")
	public String join() {
		log.debug("회원가입");
		return "member/joinForm";
	}
	
	@PostMapping("join")
	public String join(@ModelAttribute MemberDTO memberdto) {
//		log.debug("[controller-join] 회원가입 -> {}", memberdto);
		memberService.joinMember(memberdto);
		
		return "redirect:/";
	}
   
   /**
    * 로그인 페이지로 이동
    * @return loginForm.html
    */
//   @GetMapping("login")
//   public String login() {
//	   return "member/loginForm";
//   }
 
   @GetMapping("/login")
   public String login(
		   @RequestParam(value = "error", required = false) String error,
		   @RequestParam(value = "exception", required = false) String exception,
		   Model model
	   ) {
	   log.debug("error: {}, exception: {}", error, exception);
	   model.addAttribute("error", error);
	   model.addAttribute("exception", exception);
	   return "member/loginForm";
   }
   
   
   
   
}
