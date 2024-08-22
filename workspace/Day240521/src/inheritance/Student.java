package inheritance;

public class Student extends Human {
	int stNum;    // 학번
	String major; // 전공
	
	public Student(int age, String name, int stnum, String major) {
		super(age, name);
		this.stNum = stnum;
		this.major = major;
	}	
	
	void study() {
		System.out.println("공부한다");
	}
	
	void intro() {
		System.out.println("Student intro");
	}
	
} // class
