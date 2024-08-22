package uitility.string;

public class SplitTest {
	public static void main(String[] args) {
		String city = "서울,대전,대구,부산,광주";
		String[] token = city.split(",");
		
		for(String s : token) {
			System.out.println(s);
		}
		
		// 010-1234-5678
		String phone = "010-1234-5678";
		String[] number = phone.split("-");
		
		for(String s : number) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		// ↓↓↓ 선생님 코드 따라 친거 XXXXX ↓↓↓
//		String ss = "boo:aonoood:fooooooooooooooooooooo";
//		String[] ss2 = ss.split("o");
//		System.out.println(ss2.length);
//		for(String s : ss2) {
//			System.out.println("[" + s + "]");
//		}
		
		
	} // main
} // class
