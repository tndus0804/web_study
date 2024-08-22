package utility.string;

public class UpdateTest1 {

	public static void main(String[] args) {
		// toLowerCase(), toUpperCase()
		String str = "Kim Sang Hyung";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		// 기존  문자열을 바꾸고 싶다면
		str = str.toUpperCase();
		System.out.println(str);
		
		
		// trim() : 앞 뒤의 공백 제거
		// concat() : 문자열연결( + 연산자와 동일)
		String str2 = "  Kim Sang Hyung        ";
		System.out.println(str2);
		System.out.println(str2.trim());
		String str3 = str2.trim().concat("!???");
		System.out.println(str3);
		
		
		
		
		
	} // main
} // class
