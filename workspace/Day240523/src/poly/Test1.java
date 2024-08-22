package poly;

public class Test1 {
	public static void main(String[] args) {
		// 동적 바인딩
		// 실제 가리키는 객체의 메서드 실행
//		Human lee = new Student(34, "이율곡", 101, "주자학");
//		lee.intro();
		
		Human kim = new Human(29, "김상형");
		Student lee = new Student(34, "이율곡", 101, "주자학");
		
		introHuman(kim);
		introHuman(lee);
		
		
	} // main
	
	static void introHuman(Human who) {
		// Human who = new Student(34, "이율곡", 101, "주자학");
		who.intro();
	}
	
} // class
