package inheritance;

public class Human {
	String name;
	int age;
	NoteBook noteBook;
	
	public Human(int age, String name, String cpu) {
		this.age = age;
		this.name = name;
		noteBook = new NoteBook(cpu);
	}
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void introNote() {
		intro();
		noteBook.printSpec();
		//System.out.println("내 노트북의 cpu는" + );
	}
	
	public void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
	
	
} // class
