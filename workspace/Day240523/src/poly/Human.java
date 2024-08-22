package poly;

public sealed class Human permits Student, Soldier, Thief {
	String name;
	int age;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
	
	
	
	
} // class
