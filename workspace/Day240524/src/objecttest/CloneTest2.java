package objecttest;

public class CloneTest2 {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Human kim2 = (Human)kim.clone();
		
		System.out.println(kim);
		System.out.println(kim2);
		
		kim2.setName("홍길동");
		System.out.println(kim);
		System.out.println(kim2);
		
		
		
		
	} // main
} // class
