package exception;

public class ExceptionTest3 {
	
	public static void main(String[] args) {
		System.out.println("접속");
		method();
		
			
	} // main
			
	static void method() {
		try { 
			System.out.println("전송");
			System.out.println(9/0);
//			return;
		}
		catch(Exception e) {
			System.err.println("예외 처리");
		}
		finally {
			System.out.println("해제");
		}
	}
		
		
	
} // class
