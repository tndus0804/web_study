package inheritance;

public class Graduate extends Student {
	// 책 294쪽
	String thesis;
	
	public Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("연구한다.");
	}
	
//	void intro() {
//		System.out.println("graduate intro");
//	}

}
