package net.datasa.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.test.domain.dto.BoardDTO;
import net.datasa.test.domain.dto.ReplyDTO;
import net.datasa.test.security.AuthenticatedUser;
import net.datasa.test.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 거래 게시판 Ajax 요청 처리 콘트롤러
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("board")
public class BoardRestController {
	private final BoardService boardService;
	

	@GetMapping("getList")
	public ArrayList<BoardDTO> getList() {
		ArrayList<BoardDTO> list = boardService.getList();
		return list;
	}
	
	@GetMapping("getBoard")
	public BoardDTO getBoard(@RequestParam("boardNum") Integer boardNum) {
		BoardDTO dto = boardService.getBoard(boardNum);
		return dto;
	}
	
	@GetMapping("buyItem")
	public String Buy(
			@RequestParam("boardNum") Integer boardNum,
			@AuthenticationPrincipal AuthenticatedUser user
			) {
		BoardDTO boardDTO = boardService.getBoard(boardNum);
		log.debug("작성자: {}, 구매자{}", boardDTO.getMemberId(), user.getUsername());
		
		if (user.getUsername().equals(boardDTO.getMemberId())) {
			return "자신의 물건을 살 수 없습니다.";
		}
		boardService.buyIem(boardNum, user.getUsername());
		return "구매가 완료되었습니다.";
	}
	
	@GetMapping("getCommentList")
	public ArrayList<ReplyDTO> getCommentList(
				@RequestParam("boardNum") Integer boardNum
			) {
		ArrayList<ReplyDTO> list = boardService.getCommentList(boardNum);
		return list;
	}
	
  
}
