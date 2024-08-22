package com.dsa.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
@RequestMapping("member")
public class MemberController {
	
	@GetMapping("login")
	public String login() {
		log.debug("로그인 실행");
		return "member/loginForm";
	}
	
	@PostMapping("login") 
	public String login(
//			@RequestParam(name = "id") String id
			Model model
		){
		log.debug("로그인 프로세스 실행");
//		return "redirect:/member/login";
		return "redirect:/";
	}
	

}
