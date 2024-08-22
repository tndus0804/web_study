package com.dsa.web3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsa.web3.dto.MemberDTO;
import com.dsa.web3.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
@RequestMapping("basic")
// final로 선언된 모든 멤버변수 및 @NotNull이 붙은 멤버변수를
// 초기화 하는 생성자를 자동으로 생성
@RequiredArgsConstructor
public class BasicTestController {
	
	// 1. 필드주입
//	@Autowired
//	MemberService ms;
	
	// 2. 생성자주입
//	private MemberService ms;
//	@Autowired
//	public BasicTestController(MemberService ms) {
//		this.ms = ms;
//	}
	
	// 3. 명시적 생성자 사용
	private final MemberService ms;
	
	/**
	 * 저장 테스트 (서비스에서 객체를 생성해서 바로 저장)
	 * @return 메인화면으로 이동
	 */
	@GetMapping("insertData")
	public String insertData() {
		log.debug("[controller-insert] insertData 접근");
		
		ms.insertData();
		
		return "redirect:/";
	}
	
	/**
	 * 조회 테스트 (임의의 id로 회원정보 조회)
	 * @return 메인화면으로 이동
	 */
	@GetMapping("selectData")
	public String selectData() {
		
		MemberDTO memberDTO =  ms.selectData("aaa");
		log.debug("[controller-select] selectData 접근 memberDTO : {}", memberDTO);
		
		return "redirect:/";
	}
	
	/**
	 * 수정 테스트 (임의의 회원정보를 생성해서 회원정보 수정
	 * @return 메인화면으로 이동
	 */
	@GetMapping("updateData")
	public String updateData() {
		
		MemberDTO m = MemberDTO.builder()
					  .id("aaa")
					  .pw("123")
					  .name("고길동")
					  .phone("010-2222-3333")
					  .address("한국무역회관")
					  .build();
		
		ms.updateData(m);
		
		log.debug("[controller-update] updateData 접근 memberDTO :");
		return "redirect:/";
	}
	
	
	/**
	 * 삭제 테스트 (임의의 id를 가진 회원정보 삭제)
	 * @return 메인화면으로 이동
	 */
	@GetMapping("deleteData")
	public String deleteData() {
		
		boolean result = ms.deleteData("aaa");
		
		if(result)
			log.debug("[controller-delete] 삭제되었습니다.");
		else
			log.debug("[controller-delete] id가 없습니다.");
		
		return "redirect:/";
	}
	
	/**
	 * 모든 회원정보 보기
	 * @return 메인화면으로 이동
	 */
	@GetMapping("selectAllData")
	public String selectAllData() {
		
		// ctrl + 1 : 자동완성 (없는 함수 만들어줌)
		List<MemberDTO> memberList = ms.selectAllData();
		
		for (MemberDTO dto : memberList) {
			log.debug("[controller-selectAll] memberList: {}", dto);
		}
		
		return "redirect:/";
	}
}
