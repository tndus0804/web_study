package system;

public class PrintfTest {

	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "문자열";
		
//		System.out.printf("내가 쓸 문자열 형태", );
		System.out.printf("i : %04d, d : %.2f, s : %s\n", i, d, str );
		// $먼저 그 다음 .(포인트) ex) %2$.3f (o), %.32$f (x)
		System.out.printf("i : %3$d, d : %1$.3f, s : %2$s\n", d, str, i );
		// 하나의 파라미터로 다 사용하고 싶을 때
		System.out.printf("str1: %1$s, str2: %1$s, str3: %1$s", str);
		// 教科書 434페이지
		// 433 가비지 컬렉터
		
		
		
	} // main
} // class
