

public class CastTest4 {
	public static void main(String[] args) {
		// 숫자와 문자열
		int num = 123;
		String str = "456";
		
		// 문자열 -> 숫자
		num = Integer.parseInt(str); // num: 456, str = 456
		System.out.println(num);
		
		// 숫자 -> 문자열
		str = String.valueOf(num);  // num: 456, str = 456
		System.out.println(str+1);
		
		
		
		
	} // main
}