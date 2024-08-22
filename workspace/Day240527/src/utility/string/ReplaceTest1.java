package utility.string;

public class ReplaceTest1 {

	public static void main(String[] args) {
		String str = "독도는 일본땅이다. 대마도는 일본땅이다.";
		System.out.println(str.replace("일본", "한국"));
		System.out.println(str.replaceFirst("일본", "한국"));
		
		String phone = "010-1234-5678";
		// -(하이픈)을 지워버리고 싶다.
		System.out.println(phone.replace("-", ""));
		
		String[] phones = phone.split("-");
		
		
		
		
	} // main
} // class
