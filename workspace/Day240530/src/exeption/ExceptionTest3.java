package exeption;

public class ExceptionTest3 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int a = 5;
		int b = 2;
		int c = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			c = a / b;
			System.out.println(c);
			arr[5] = 100;
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 배열의 범위를 넘어갔다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("프로그램 종료");
	} // main
	
} // class
