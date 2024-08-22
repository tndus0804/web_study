
public class AlphabetCntTest {

	public static void main(String[] args) {
		// 문자열에 있는 알파벳 세기
		String pop = "Yesterday all my troubles";
		// 대문자로 바꾸기
		pop = pop.toUpperCase();
		System.out.println(pop);
		
		// n번째 있는 글자수를 반환 charAt(n-1)
		char ch = pop.charAt(4);
		System.out.println(ch);
		
		
	} // main

} // class
