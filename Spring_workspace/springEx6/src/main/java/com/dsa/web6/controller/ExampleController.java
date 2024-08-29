package com.dsa.web6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsa.web6.entity.MemberEntity;
import com.dsa.web6.service.AjaxService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ExampleController {
	private final AjaxService ajaxService;
	
	/**
	 * 아이디 중복 확인 페이지로 이동
	 * @return idDuplicate.html 
	 */
	@GetMapping("idDuplicate")
	public String idDuplicate() {
		return "example/idDuplicate";
	}
	
	/**
	 * 아이디 존재 여부 확인
	 * @param id			조회할 아이디
	 * @return true/false	아이디가 존재하면, true, 존재하지 않으면 false 
	 */
	@ResponseBody
	@PostMapping("idDuplicate")
	public Boolean idDuplicate(@RequestParam("id") String id) {
//		if(ajaxService.idDuplicate(id)) {
//			return "중복됨";
//		} else {
//			return "중복되지 않음";
//		}
		boolean result = ajaxService.idDuplicate(id);
		return result;
	}
	
	@ResponseBody
	@PostMapping("join")
//	public String join(@ModelAttribute PersonDTO person) {
	public String join(
			@RequestParam("id") String id,
			@RequestParam("name") String name
		) {
		MemberEntity entity = MemberEntity.builder()
							  .id(id)
							  .name(name)
							  .build();
		
		log.debug("join id: {}", entity);
		ajaxService.join(entity);
		return "회원가입 성공!";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
