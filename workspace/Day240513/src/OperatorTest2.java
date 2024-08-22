
public class OperatorTest2 {

	public static void main(String[] args) {
		int a = 6;
		// a값을 1증가 시키는 방법
		a = a + 1;
		System.out.println(a); // 출력값: 7
		
		// a += 1 -> a = a + 1의 축약
		a += 1;
		System.out.println(a); // 출력값: 8
		
		// ++연산자를 앞에 붙였을 때
		// 다 필요없고 연산 먼저(증가가 최우선)
		System.out.println(++a); // 출력값: 9
		System.out.println(a); // 출력값: 9 
		
		// ++ 연산자를 뒤에 붙였을때
		// 세미콜론으로 문장 끝난 후에 (증가가 최후)
		System.out.println(a++); // 출력값: 9
		System.out.println(a); // 출력값: 10
		
		
	}

}
