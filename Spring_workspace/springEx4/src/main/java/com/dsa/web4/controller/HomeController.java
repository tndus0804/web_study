package com.dsa.web4.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class HomeController {
	
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	
}
