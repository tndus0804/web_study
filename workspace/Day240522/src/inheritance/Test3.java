package inheritance;

public class Test3 {
	 
	public static void main(String[] args) {
		// 메서드 재정의(Overriding)
		Human kim = new Human(29, "김상형");
		kim.intro();
		Student std = (Student)kim;
		std.study();
		
		Student lee = new Student(42, "이승우", 101, "경영");
		lee.intro();

		Human park = new Human(30, "박길동", "i7");
		park.introNote();
		
		// 다형성
		Human choi = new Student(33, "최씨", 102, "컴공");
		Student s = (Student) choi;
		s.study();
		
		
		
	}
	
} // class
