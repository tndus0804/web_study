package boxunbox;

public class MemberTest {

	public static void main(String[] args) {
		// 래퍼 클래스의 필드
		System.out.printf("int 타입의 크기 = %s, 최솟값 = %d, 최댓값 = %d\n",
						Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		// 2진수
		System.err.println(Integer.toBinaryString(333));
		
		Double d = 1234.1;
		System.out.println(d.isNaN());
		
		Double d2 = Math.sqrt(-2);
		System.out.println(d2.isNaN());
		
		
		
		
		
	} // main
} // class
