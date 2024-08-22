package inheritance;

public class Test2 {
	 
	public static void main(String[] args) {
		Student lee = new Student(35, "이율곡", 1001, "주자학");
		System.out.println(lee);
		
		Soldier kang = new Soldier(45, "강감찬", 12345);
		kang.fight();
		
		Thief hong = new Thief(15, "홍길동", "부자집", 2);
		hong.steal();
	}
	
} // class
