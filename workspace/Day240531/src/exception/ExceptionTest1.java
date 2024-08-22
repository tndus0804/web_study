package exception;

import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		while(true) {
			System.out.print("이름: ");
			name = sc.nextLine();
			if(name.equals("")) {
				System.out.println("* 이름을 입력하세요.");
			}
			else {
				break;
			}
			
		}
		try {
			printScore(name);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램 정상 종료");
	} // main
	
	private static void printScore(String name) {
		if(name == null || name.equals("")) {
			// 예외 던지기
			throw new NullPointerException("이름이 무효");
		}
		System.out.println(name.length());			
		
	}
	
} // class
