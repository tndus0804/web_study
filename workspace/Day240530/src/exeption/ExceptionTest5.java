package exeption;

public class ExceptionTest5 {
		
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	} // main
	
	static void method() {
		subMethod();
	}
	
	static void subMethod() {
		int a = 2;
		int b = 0;
		int c = 0;
		
		c = a / b;
		System.out.println(c);
			
	}
	
	
	
} // class
