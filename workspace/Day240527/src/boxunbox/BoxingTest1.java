package boxunbox;

public class BoxingTest1 {

	public static void main(String[] args) {
		int i = 1234;
		// 정수 -> 문자열 (기본형 -> 참조형)
		// Integer wrapint = new Integer(i);
//		Integer wrapint = Integer.valueOf(i);
		Integer wrapint = i;
		String str = wrapint.toString();
		System.out.println(str);
		
		// 문자열 -> 정수
		i = Integer.parseInt(str);
		System.out.println(i);
		
		
		
	} // main
} // class
