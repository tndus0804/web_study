package inheritance;

public class Test extends Human {
	 
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
//		kim.name = "김상형";
//		kim.age = 29;
		kim.intro();
		
		Student hong = new Student(20, "홍길동", 1001, "경영학");
		hong.age = 20;
		hong.name = "홍길동";
		
		
		Graduate park = new Graduate(35, "박대희", 1002, "전산", "웹 보안 연구");
		park.intro();
		park.study();
		park.research();
		
		
	}
	
} // class
