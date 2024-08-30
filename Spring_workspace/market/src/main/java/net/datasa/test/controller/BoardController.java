package net.datasa.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.test.domain.dto.BoardDTO;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.security.AuthenticatedUser;
import net.datasa.test.service.BoardService;
import net.datasa.test.service.MemberService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 거래 게시판 관련 콘트롤러
 */

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("board")
public class BoardController {
	private final BoardService boardService;

	@GetMapping("list")
	public String list() {
		return "board/list";
	}
	
	@GetMapping("write")
	public String wirte(@AuthenticationPrincipal AuthenticatedUser user) {
//		log.debug(user.getUsername());
		return "board/writeForm";
	}
	
	@PostMapping("write")
	public String write(
			@ModelAttribute BoardDTO boardDTO
			, @AuthenticationPrincipal AuthenticatedUser user
//			@RequestParam("price") String price
		) {
		boardDTO.setMemberId(user.getUsername());
		log.debug("boardDTO: {}", boardDTO);
		boardService.writeBoard(boardDTO);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("read")
	public String read(
			@RequestParam("boardNum") Integer boardNum,
			Model model
		) {
		model.addAttribute("boardNum", boardNum);
		return "board/read";
	}
}
