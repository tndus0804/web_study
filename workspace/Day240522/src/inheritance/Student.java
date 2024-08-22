package inheritance;

public class Student extends Human {
	int stNum;    // 학번
	String major; // 전공
	
	public Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stNum = stnum;
		this.major = major;
	}	
	
//	void intro() {
////		super.intro();
//		System.out.println(major + "학과 " + stNum + "학번 " + name + "입니다.");
//		
//	}
	
	@Override // 어노테이션
	public void intro() {
		super.intro();
	}
	
	void study() {
		System.out.println("공부한다");
	}
	
} // class
