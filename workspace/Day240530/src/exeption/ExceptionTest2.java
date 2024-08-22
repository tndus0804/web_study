package exeption;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
//			Thread.sleep(3000);
			Thread.sleep(1000); // 1초
			System.out.println("1");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("3");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	} // main
	
} // class
