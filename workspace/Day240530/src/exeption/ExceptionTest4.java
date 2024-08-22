package exeption;

public class ExceptionTest4 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int a = 5;
		int b = 2;
		int c = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			c = a / b;
			System.out.println(c);
			arr[11] = 100;
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("프로그램 종료");
	} // main
	
} // class
