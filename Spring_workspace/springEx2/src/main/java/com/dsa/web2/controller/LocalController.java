package com.dsa.web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalController {
	
	@GetMapping("local/save")
	public String save() {
		return "local/save";
	}
	
	@GetMapping("local/read")
	public String read() {
		return "local/read";
	}
	
	@GetMapping("local/delete")
	public String delete() {
		return "local/delete";
	}
}
