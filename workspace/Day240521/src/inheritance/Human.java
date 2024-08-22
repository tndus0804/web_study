package inheritance;

public class Human {
	String name;
	int age;
	
	// 기본 생성자
	public Human() {
		System.out.println("Human 기본 생성자");
	}
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
	
	
} // class
