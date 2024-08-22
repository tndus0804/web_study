import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 연산자를 먼저 입력 받는다. (+, -, *, /) 중
		// 정수 두개를 입력받는다.
		// 결과를 출력한다. ex) + 2 3 
		
		Scanner sc = new Scanner(System.in);
		// 문자열 입력
		// next();
		// 단어: 공백을 기준으로 앞에 있는 문자열을 반환
//		String str = sc.next();
//		System.out.println(str);
		// nextLine();
		// 문장: 엔터키를 기준으로 앞에 있는 문자열을 반환
//		String str = sc.nextLine();
//		System.out.println(str);
//		System.out.println(10 / 0); // 런타임 에러
		
		System.out.print("연산자(+,-,*,/): ");
		String oper = sc.next();
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		// 연산의 결과를 담아둘 변수
		int result = 0;
		
		switch (oper) {
		case "+": 
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.print("* 0으로 나눌 수 없습니다.");
				sc.close();
				return;
			}
			result = num1 / num2;
			break;
		default:
			System.err.print("* 사칙연산 중에 고르세요. ");
			// 1. return을 만나 프로그램 종료
//			return;
			// 2. System.exit(0);
			System.exit(0);
			
//			throw new IllegalArgumentException("Unexpected value: " + oper);
		}
		System.out.printf("%d %s %d => %d", num1, oper, num2, result);
		
		sc.close();
	} // main
} // class
