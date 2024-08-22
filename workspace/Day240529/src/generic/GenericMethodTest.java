package generic;

public class GenericMethodTest {
	
	public static void main(String[] args) {
		// 1234 출력
		print(1234);
		
		// 문자열 출력
//		print("문자열 출력");
	
	} // main
	
	static <T> void print(T t) {
		System.out.println(t);
	}
	
	
} // class
