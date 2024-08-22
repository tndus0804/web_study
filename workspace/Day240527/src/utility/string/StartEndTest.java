package utility.string;

public class StartEndTest {

	public static void main(String[] args) {
		String[] str = {
				"girl.jpg",
				"boy.png",
				"child.avi",
				"school.jpg ",
				"book.gif", };
		
//		System.out.println(str.startsWith("book"));
//		System.out.println(str.endsWith("if"));
		// 파일 확장자가 jpg
		// trim 원래 문자열 영향 X
		
		for(String s : str) {
			if(s.trim().endsWith(".jpg")) {
				System.out.println(s);
			}
		}
		
//		for(int j = 0; j<str.length; j++) {
//			if(str[j].endsWith(".jpg"))
//				System.out.println((j + 1)+"번째 " + str[j]);
//		}
		
		
		
		
		
		
		
		
	} // main
} // class
