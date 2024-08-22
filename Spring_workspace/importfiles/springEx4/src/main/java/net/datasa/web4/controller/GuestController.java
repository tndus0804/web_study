package net.datasa.web4.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web4.dto.GuestBookDTO;
import net.datasa.web4.service.GuestService;

@Slf4j
@Controller
@RequestMapping("guest")
@RequiredArgsConstructor
public class GuestController {

	private final GuestService service;
	
	/**
	 * 입력 폼으로 이동
	 * @return 글 작성 폼이 포함된 HTML 파일 경로
	 */
	@GetMapping("write")
	public String writeForm() {
		return "writeForm";
	}
	
	/**
	 * 작성한 글 전달받아 저장
	 * @param dto 입력폼에서 작성한 글 내용
	 * @return 글목록으로 이동할 경로
	 */
	@PostMapping("write")
	public String write(@ModelAttribute GuestBookDTO guestbook) {
		log.debug("작성한 글 : {}", guestbook);
		service.write(guestbook);
		return "redirect:/guest/guestList";
	}
	
	/**
	 * 글 목록 보기
	 * @param model 출력 내용을 HTML로 전달할 객체
	 * @return 출력할 HTML 파일 경로
	 */
	@GetMapping("guestList")
	public String guestList(Model model) {
		List<GuestBookDTO> guestList = service.selectAll();
		model.addAttribute("guestList", guestList);
		log.debug("guestList : {}", guestList);
		return "guestList";
	}
	
	/**
	 * 글 삭제 
	 * @param num 삭제할 글번호
	 * @param password 비밀번호
	 * @param redirectAttributes 리다이렉트할 때 오류 메시지를 전달할 객체
	 * @return 글 목록 경로
	 */
	@PostMapping("delete")
	public String delete(GuestBookDTO guestbook
			, RedirectAttributes ra) {
		try {
			log.debug("guestbook 삭제 {}", guestbook);
			service.delete(guestbook);
		} catch (Exception e) {
			e.printStackTrace();
			ra.addFlashAttribute("msg", "삭제 실패했습니다.");
		}
		return "redirect:/guest/guestList";
	}	
}
