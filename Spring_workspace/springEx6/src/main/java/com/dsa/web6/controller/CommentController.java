package com.dsa.web6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("comment")
public class CommentController {
	
	/**
	 * 댓글 달기 html으로 이동
	 * @return comment.html 
	 */
	@GetMapping("main")
	public String comment() {
		return "example/comment";
	}
	
	
}
