
public class VariableTest7 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 진위형(참이냐 거짓이냐)
		boolean bool = true;
		boolean bool2 = false;
		
		boolean bool3 = (10 > 5);
		
		System.out.println(bool3);
		
//		if(true or false가 값으로 나오는 식)
		// true라면 중괄호 코드 실행
		// false면 스킵
		int a = 4;
		if(a > 5) {
			System.out.println("a는 5보다 크다");
		}
	} // main
} // class
