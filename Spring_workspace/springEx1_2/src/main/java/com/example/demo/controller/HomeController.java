package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"", "/"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/image")
	public String image( ) {
		return "image";
	}
	@GetMapping("/css")
	public String css( ) {
		return "css";
	}
	@GetMapping("/js")
	public String js( ) {
		return "js";
	}
	
}
