package poly;

public final class Graduate extends Student {
	// 책 294쪽
	String thesis;
	
	public Graduate(int age, String name, int stnum, String major, String thesis) {
		super(age, name, stnum, major);
		this.thesis = thesis;
	}
	
	@Override
	public void intro() {
		System.out.println(thesis + " 논문을 쓰고 있다.");
	}

	void research() {
		System.out.println("연구한다.");
	}

}
