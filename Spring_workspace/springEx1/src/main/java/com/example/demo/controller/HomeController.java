package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	int a;
	
	// http://localhost:9991/ 경로로 요청이 들어왔을 때 실행될 메서드
	@GetMapping({"", "/"})
	public String home() {
		
		// templates 경로의 home.html 문사를 찾음
		return "home";
	}
	
	@GetMapping("image")
	public String image() {
		System.out.println(++a);
		return "image";
	}
	
	@GetMapping("sub/image2")
	public String image2() {
		System.out.println(++a);
		return "image2";
	}
	
	@GetMapping("css")
	public String css() {
		return "css";
	}
	
	@GetMapping("js")
	public String js() {
		return "javascript/js";
	}
	
}
