package com.dsa.web5.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=RuntimeException.class) 
	@ResponseBody
	public ResponseEntity<String> handleArgumentException(RuntimeException e) {
		String script = 
				"<script>" +
					"window.onload = function(){"
						+ "alert('" + e.getMessage()+"'); "
						+ "setTimeout(function(){"
						+ 	"window.location.replace('/web5/board/listAll');"
						+	"}, 500);"
					+"}"
				+ "</script>";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=UTF-8");
//		return "<h1>" + e.getMessage()+"</h1>";
		return new ResponseEntity<>(script, headers, HttpStatus.OK);
	}
}
