package net.datasa.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import net.datasa.service.BMIService;
import net.datasa.vo.Member;

public class BmiUI {
	
	Scanner sc = new Scanner(System.in);
	BMIService service = new BMIService();
	
	public BmiUI() {
		while(true) {
			menu();
			String choice = sc.next();
			
			switch(choice) {
			case "1": // 회원 등록
				insertMember();
				break;
			
			case "2": // 회원 조회(1명)
				selectByCode();
				break;
				
			case "3": // 회원 전체 조회
				selectAll();
				break;
				
			case "4": // 회원 정보 수정
				updateMember();
				break;
				
			case "5": // 회원 탈퇴
				deleteMember();
				break;
			
			case "0": {
				System.out.println("* 프로그램 종료");
				return;
			}
			default: 
				System.err.println("* 메뉴에 있는 번호를 선택하세요");
				try {
					Thread.sleep(50);
				} catch(Exception e) {}
			
			} //switch
			System.out.println();
		} // while
	}
	private void deleteMember() {
		System.out.println("< 회원 탈퇴 >");
		System.out.print("탈퇴할 회원의 코드: ");
		int code = 0;
		try {
			code = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("* 코드는 정수로 입력하세요.");
			sc.nextLine(); // 엔터키 날리기
			return;
		}
		Member selectMember = service.selectByCode(code);
		// 회원 존재하지 않음
		if(selectMember == null) {
			System.out.println("해당 멤버는 존재하지 않습니다.");
			return;
		}
		// 탈퇴 작업 <- 회원 존재
		System.out.print("정말 탈퇴하시겠습니까? ");
		String ans = sc.next();
		if(ans.equals("y") || ans.equals("Y")) {
			// 탈퇴 처리
//			service.deleteMember(selectMember);
			service.deleteMember(code);
			System.out.println("* 회원 삭제 성공!");
			selectAll();
			return;
		}
		System.out.println("* 회원 탈퇴 취소");
	}
	
	private void updateMember() {
		// 회원 정보 수정
		System.out.println("< 회원 정보 수정 >");
		System.out.print("수정할 회원의 코드: ");
		int code = 0;
		
		try {
			code = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("* 코드는 정수로 입력하세요.");
			sc.nextLine(); // 엔터키 날리기
			return;
		}
		Member selectMember = service.selectByCode(code);
		// 회원 존재하지 않음
		if(selectMember == null) {
			System.out.println("해당 회원은 존재하지 않습니다.");
			return;
		}
		// 회원 존재
		double height = 0;
		double weight = 0;
		
		System.out.println("1) 키만 바꾸기");
		System.out.println("2) 몸무게만 바꾸기");
		System.out.println("3) 키와 몸무게 둘 다 바꾸기");
		int choice = -1;
		
		try {
			System.out.print("수정할 키(cm): ");
			height = sc.nextDouble();
			System.out.print("수정할 몸무게(kg): ");
			weight = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.err.println("* 키와 몸무게는 숫자로 입력해 주세요!");
			sc.nextLine();
			return;
		}
		// service.updateMember(selectMember, height, weight);
		selectMember.setHeight(height);
		selectMember.setWeight(weight);
		selectMember.calcBMI();
		System.out.println("* 회원 수정 성공!");
		
	}
	
	private void selectAll() {
		// 회원 전체 조회
		System.out.println("< 회원 전체 조회 >");
		ArrayList<Member> members = service.selectAll();
		if(members.isEmpty()) {
			System.err.println("회원이 존재하지 않습니다.");
			return;
		}
		for(Member m : members) {
			System.out.print(m);
		}
	}
	
	private void insertMember() {
		// 멤버 등록
		System.out.println("< 회원 등록 >");
		System.out.print("이름: ");
		String name = sc.next();
		double height = 0;
		double weight = 0;
		
		try {
			System.out.print("키(cm): ");
			height = sc.nextDouble();
			System.out.print("몸무게(kg): ");
			weight = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("* 키와 몸무게는 숫자로 입력해 주세요!");
			sc.nextLine();
			return;
		}
			
		Member member = new Member(name, height, weight);
		service.insertMember(member);
		System.out.println("* 회원 등록 성공!");
		System.out.println(member);
	}
	
	private void selectByCode() {
		// 회원 조회 1명
		System.out.println("< 회원 조회(1명) >");
		System.out.print("조회할 회원의 코드: ");
		int code = 0;
		
		try {
			code = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("* 코드는 정수로 입력하세요.");
			sc.nextLine(); // 엔터키 날리기
			return;
		}
		
		Member member = service.selectByCode(code);
		// 못 찾은 경우
		if(member == null) {
			System.out.println("해당 코드의 회원이 존재하지 않습니다.");
			return;
		}
		System.out.println(member);
	}
	
	public void menu() {
		System.out.println("<< 회원 관리 프로그램 >>");
		System.out.println("  1. 회원 등록");
		System.out.println("  2. 회원 조회(1명)");
		System.out.println("  3. 회원 전체 조회");
		System.out.println("  4. 회원 정보 수정");
		System.out.println("  5. 회원 탈퇴");
		System.out.println("  0. 프로그램 종료");
		System.out.println("=================");
		System.out.print(">> ");
	}
	
	
} // class
