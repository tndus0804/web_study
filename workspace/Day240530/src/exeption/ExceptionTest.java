package exeption;

public class ExceptionTest {
	
	public static void main(String[] args) {
		// 534페이지 예외처리
		int a = 2;
		int b = 0;
		int c = 0;
		
		try {
			// 예외가 발생할 수도 있는 코드
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			// 예외를 어떻게 처리할 것인가
//			System.out.print("0으로 나눌 수 없습니다. ");
			System.out.println(e.getMessage()); // / by zero
//			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
		
		
		
	} // main
	
} // class
