package boundtype;

public class Test1 {

	public static void main(String[] args) {
		Human h = new Human();
		
		Box<Human> bh = new Box<>(h);
		bh.intro();
		printMan(bh);
		
		
		Student s = new Student();
		Box<Student> bs = new Box<>(s);
		bs.intro();
		System.out.println(bh.getClass() == bs.getClass());
		printMan(bs);
		
		
	} // main
	
	// ? 위쪽 제한 와일드 카드
	// 
	static void printMan(Box<? extends Human> box) {
		System.out.print("print box -> ");
		box.intro();
	}
	
	
	
	
} // class
