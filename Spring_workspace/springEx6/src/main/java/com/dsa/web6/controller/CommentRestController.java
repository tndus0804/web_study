package com.dsa.web6.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsa.web6.dto.CommentDTO;
import com.dsa.web6.service.CommentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("comment")
// @Controller + @ResponseBody 합친 결과
// 클래스 내의 모든 메서드에 @ResponseBody 적용
@RestController
public class CommentRestController {
	private final CommentService service;
	
	/**
	 * 댓글 목록 조회
	 * @return 댓글 목록
	 */
	@GetMapping("getCommentList")
	public List<CommentDTO> getCommentList() {
		List<CommentDTO> list = service.getList();
		log.debug("getCommentList: {}", list);
		return list;
	}
	
	/**
	 * 댓글 저장
	 * @param CommentDTO 저장할 댓글 정보
	 */
	@PostMapping("write")
	public void writeComment( @ModelAttribute CommentDTO dto ) {
		log.debug("저장할 댓글 정보: {}", dto);
		service.writeComment(dto);
	}
	
	/**
	 * 댓글 삭제
	 * @param num 삭제할 댓글 번호
	 */
	@PostMapping("deleteComment")
	public void deleteComment( @RequestParam("num") Integer num) {
		service.deleteComment(num);
	}
	
	/**
	 * 댓글 수정
	 * @param CommentDTO 수정할 댓글 정보
	 */
	@PostMapping("updateComment")
	public void updateComment( @ModelAttribute CommentDTO dto ) {
		log.debug("수정 할 댓글 정보: {}", dto);
		service.updateComment(dto);
	}
}
