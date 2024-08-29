package com.dsa.web6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsa.web6.dto.PersonDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * AJAX 컨트롤러
 */
@Controller
@Slf4j
public class Ajax2Controller {

	@GetMapping("ajax2")
	public String ajax2() {
		return "ajax/ajax2";
	}
	
	/**
	 * 파라미터를 각각의 변수로 전달
	 */
	@ResponseBody
	@PostMapping("insert1")
	public void insert1(
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("phone") String phone
		) {
		log.debug("insert1: name={}, age={}, phone{}", name, age, phone);
	}
	
	/**
	 * 파라미터를 DTO 객체로 전달받기
	 */
	@ResponseBody
	@PostMapping("insert2")
	public void insert2(@ModelAttribute PersonDTO person) {
		log.debug("insert2: {}", person);
	}
	
	/**
	 * 파라미터를 DTO 객체로 전달받기 2
	 */
	@ResponseBody
	@PostMapping("insert3")
	public void insert3(@ModelAttribute PersonDTO person) {
		log.debug("insert3: {}", person);
	}
	
	/**
	 * 객체 리턴
	 */
	@ResponseBody
	@GetMapping("getObject")
	public PersonDTO getObject() {
		PersonDTO person = new PersonDTO("홍길동", 20, "010-1111-2222");
		return person;
	}
	
	/**
	 * 리스트 리턴
	 */
	@ResponseBody
	@GetMapping("getList")
	public List<PersonDTO> getList() {
		List<PersonDTO> list = new ArrayList<>();
		list.add(new PersonDTO("홍길동", 30, "010-1111-2222"));
		list.add(new PersonDTO("김철수", 40, "010-3333-4444"));
		list.add(new PersonDTO("김영희", 50, "010-3333-4444"));
		return list;
	}
	
	/**
	 * 클라이언트로부터 배열 전달
	 */
	@ResponseBody
	@PostMapping("sendArray")
	public void sendArray(
//			@RequestParam("ar") String[] ar,
			@RequestParam("ar") List<String> ar
		) {
		if (ar == null) {
			log.debug("ar: null");
		} else {
			for (String s : ar) {
				log.debug("배열요소: {}", s);
			}
		}
	}
	
	@ResponseBody
	@PostMapping("sendObjectArray")
	public String sendObjectArray(@RequestParam("ar") String ar) throws Exception {
		if (ar == null) {
			log.debug("ar: null");
			return null;
		} else {
			log.debug("ar: {}", ar);
		}
		
		// Jackson 라이브러리는 Java에서 JSON 데이터의 직려로하 및 역 직렬화를
		//		처리하는 데 널리 사용되는 JSON 처리 라이브러리
		// JSON 객체의 역직렬화 : JSON 문자열을 자바 객체로 변환
		ObjectMapper objectMapper = new ObjectMapper();
		// import com.fasterxml.jackson.core.type.TypeReference
		ArrayList<PersonDTO> list = objectMapper.readValue(ar
				, new TypeReference<ArrayList<PersonDTO>>() {});
		log.debug("변환결과 리스트: {}", list);
		
		for (Object ob : list) {
			log.debug("요소타입: {}", ob.getClass());
			log.debug("요소값: {}", ob);
		}
		
		// JSON 객체의 직렬화 : 자바 객체를 JSON 형식의 분자열로 변환
		ObjectMapper om = new ObjectMapper();
		ArrayList<PersonDTO> plist = new ArrayList<>();
		plist.add(new PersonDTO("홍길동", 20, "010-1111-2222"));
		plist.add(new PersonDTO("이순신", 30, "010-2222-1111"));
		plist.add(new PersonDTO("강감찬", 40, "010-3333-3333"));
		
		String jsonString = om.writeValueAsString(plist);
		return jsonString;
	}
}
