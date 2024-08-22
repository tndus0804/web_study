package com.dsa.web99.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"", "/"})
	public String Index() {
		System.out.println("index");
		return "index";
	}
	
	@GetMapping("path111")
	public String image() {
		return "image111";
	}
	
}
