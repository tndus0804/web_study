package com.dsa.web2.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("ex")
public class ExController {
	
	@GetMapping("info")
	public String info() {
		return "ex/info";
	}
	// 내 코드
//	@RequestMapping(value = "/output", method = RequestMethod.GET)
//	@GetMapping("output")
	public String output(
			@RequestParam(name = "name") String name,
			@RequestParam(name = "ssn") String ssn,
			Model model
			) {
		/*
		 * info.html에서 입력받은 데이터를 파라미터로 받아오기
		 * 주민번호의 각 자리별 정보를 통해 나이. 생년월일, 성별을 추출
		 * model 을 통해 output.html에 이름, 나이, 생년월일, 성별을 전송
		 * */
		log.debug("output_param : name={}, ssn={}", name, ssn);
		
		Date date = new Date();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		String ssnArr[] = ssn.split("-");
		int age;
		String birth = ssnArr[0];
		String gender;
		String birthYear = ssnArr[0].substring(0, 2);
		String birthMonth = ssnArr[0].substring(2, 4);
		String birthDate = ssnArr[0].substring(4, 6);
		
		birthYear = ((Integer.parseInt(birthYear) < 30) ? "20" : "19") + birthYear;
		
		age = Integer.parseInt(year.format(date)) - Integer.parseInt(birthYear) + 1;
		// "000804-1234567"
		if(ssnArr[1].charAt(0)=='1' || ssnArr[1].charAt(0)=='3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		log.debug("이름: {}, 주민번호: {}", name, ssn);
		log.debug("지금 {}년 태어난 년도: {} 나이 {}", year.format(date), birthYear, age);
		
		birth = birthYear + "년 " + birthMonth + "월 " + birthDate + "일";
		
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("birth", birth);
		model.addAttribute("gender", gender);
		
		return "ex/output";
	}
	
	// 강사님 코드
//	@RequestMapping(value = "/output", method = RequestMethod.GET)
	@GetMapping("output")
	public String output1(
			@RequestParam(name = "name") String name,
			@RequestParam(name = "ssn") String ssn,
			Model model
			) {
		/*
		 * info.html에서 입력받은 데이터를 파라미터로 받아오기
		 * 주민번호의 각 자리별 정보를 통해 나이. 생년월일, 성별을 추출
		 * model 을 통해 output.html에 이름, 나이, 생년월일, 성별을 전송
		 * */
		log.debug("output_param : name={}, ssn={}", name, ssn);
		
		char gender = ssn.charAt(7);
		String genderResult = 
				( gender == '1' || gender == '3' ) ? "남자" : "여자";
		int year = Integer.parseInt(ssn.substring(0,2));
		int month = Integer.parseInt(ssn.substring(2,4));
		int day = Integer.parseInt(ssn.substring(4,6));
		
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int age;
		if (gender == '1' || gender == '2')
			age = y - year - 1900;
		else {
			age = y - year - 2000;
			log.debug("나이 {}" + age);
		}
		String birth = String.format("%d년 %d월 %d일", year, month, day);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("birth", birth);
		model.addAttribute("gender", genderResult);
		
		return "ex/output";
	}
	
	/*
	 * Cookie 객체를 이용한 방문 횟수 count 예제 
	 */
	@GetMapping("count")
	public String count(
				Model model,
				HttpServletResponse response,
				@CookieValue(name = "count", defaultValue = "-1") int count
			) {
		// 코드
		Cookie c = new Cookie("count", String.valueOf(++count));
		// Integer.toString(count)
		// String.valueOf(count)
		
		// String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
		// toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
		// 두가지 메서드의 차이점은 null값에 따른 NPE의 발생 유무이다.
		
		c.setMaxAge(60 * 60 * 24);
		response.addCookie(c);
		model.addAttribute("count", count);
		return "ex/count";
	}
	
	@GetMapping("clearCookie")
	public String clearCookie(
			HttpServletResponse response,
			Model model
		) {
		Cookie c = new Cookie("count", "0");
		c.setMaxAge(60 * 60 * 24);
		
		response.addCookie(c);
		model.addAttribute("count", 0);
		
		return "redirect:/ex/count";
	}
	
	
	
	
	
	
}
