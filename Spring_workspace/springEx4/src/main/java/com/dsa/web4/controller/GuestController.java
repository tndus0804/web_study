package com.dsa.web4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsa.web4.dto.GuestBookDTO;
import com.dsa.web4.service.GuestService;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@Slf4j
@RequestMapping("guest")
@RequiredArgsConstructor
public class GuestController {
	
	private final GuestService service;
	
	@GetMapping("write")
	public String write() {
		return "writeForm";
	}
	
	@PostMapping("write")
	public String write(@ModelAttribute GuestBookDTO guestBook) {
		log.debug("\nid: {}\n비밀번호: {}\n내용: {}", guestBook.getName(), guestBook.getPassword(), guestBook.getMessage());
		service.insertMessage(guestBook);
		return "redirect:/";
	}
	
//	@PostMapping("write")
//	public String write(
//			@RequestParam(name = "name") String name,
//			@RequestParam(name = "password") String password,
//			@RequestParam(name = "message") String message
//		) {
//		log.debug("id: {}\n비밀번호: {}\n내용: {}", name, password, message);
//		return "redirect:/guest/guestList";
//	}
	
	@GetMapping("guestList")
	public String guestList(Model model) {
		List<GuestBookDTO> list = service.selectList();
		model.addAttribute("list", list);
		
		return "guestList";
	}
	
	@PostMapping("delete/{num}")
	public String delete(
				@PathVariable (name = "num") int num,
				@RequestParam (name = "password") String password,
				HttpServletResponse response
			) {
		GuestBookDTO book = service.selectBook(num);
		log.debug("게시글 num: {}, 입력한  비밀번호: {}", num, password);
		if(book == null) {
			log.debug("없는 게시글 번호 입니다. -> 코드에러");
			return "redirect:/guest/guestList";
		}else {
			log.debug("게시글 있음");
		}
		
		if(book.getPassword().equals(password)) {
			service.delete(num);
			log.debug("삭제 완료");
		} else {
			log.debug("삭제 실패 -> 비밀번호가 틀립니다.");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter w;
			try {
				w = response.getWriter();
//				w.write("<script>alert('비밀번호가 틀립니다.');location.href='/web4/guest/guestList';</script>");
				w.write("<script>alert('비밀번호가 틀립니다.');history.go(-1);</script>");
//				w.write("<script>alert('비밀번호가 틀립니다.');window.close();</script>"); //알림창 표시후 창을 닫는다
//				w.write("<script>alert('비밀번호가 틀립니다.');</script>"); //알림창 표시만 해준다
//				w.write("<script>alert('비밀번호가 틀립니다.');</script>");
				
				w.flush();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		return "redirect:/guest/guestList";
	}
	

}
