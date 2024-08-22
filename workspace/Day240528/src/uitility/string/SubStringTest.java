package uitility.string;

public class SubStringTest {
	public static void main(String[] args) {
		String str = "0123456789";
		// subString(n1, n2);
		// 호출 문자열의 n1인덱스부터 n2이전까지 반환
		System.out.println(str.substring(3, 7));
		
		
		// 5678
		System.out.println(str.substring(5, 9));
		
		String name = "제 이름은 <김한결> 입니다.";
		// 이름만 추출
		int st = name.indexOf('<');
		int ed = name.indexOf('>');
		
		System.out.println(st);
		System.out.println(ed);
		System.out.println(name.substring(st+1, ed));
		
		
		
		
		
		
	} // main
} // class
