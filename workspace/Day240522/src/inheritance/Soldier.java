package inheritance;

public class Soldier extends Human {
	int milnum; // 군번
	
	public Soldier(int age, String name, int milnum) {
		// 부모클래스 생성자 호출
		super(age, name);
		this.milnum = milnum;
	}

	void fight() {
		System.out.println("전투");
	}
	
}
