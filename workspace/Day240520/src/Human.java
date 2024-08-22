
public class Human {
	int age;
	String name;
	
	// 기본 생성자
	public Human() {
//		System.out.println("Human의 기본 생성자");
	}
	
	public Human(int age) {
		this.age = age;
	}
	
	// 242p 생성자 오버로딩
	// 사용자 정의 생성자
	Human(int age, String name) {
		this(); // ← 생성자 호출
		this.age = age;
		this.name = name;
	}
	
	void introduce(Human human) {
		System.out.println(human);
		System.out.println("안녕. " + age + "살 " + name + "입니다.");
	}
	
	
} // class
