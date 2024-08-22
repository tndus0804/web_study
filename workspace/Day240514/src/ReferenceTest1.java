
public class ReferenceTest1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 책 189p
		// 자바의 메모리
		// 정적 영역: 클래스를 저장하고 로드
		int[] scores = new int[5];
		// 스택: scores(주소값, 참조값) @6d9c6368
		// 힙 : scores가 주소값으로 가리키는 실제 데이터
		
		
		// 기본형 변수(Primitive Variable)
		// byte, short, int, long
		// float, double
		// char
		// boolean
		int i = 1234;
		System.out.println(i);
		// 참조형 변수(Reference Variable)
		// 기본형 제외한 모든 변수
		
		int[] ar = new int[10];
		System.out.println(ar);
		String str = null;
		System.out.println(str);
		
		
		
	} // main
} // class
