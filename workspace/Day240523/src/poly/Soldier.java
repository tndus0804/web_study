package poly;

public final class Soldier extends Human {
	int milnum; // 군번
	
	public Soldier(int age, String name, int milnum) {
		// 부모클래스 생성자 호출
		super(age, name);
		this.milnum = milnum;
	}

	
	@Override
	public void intro() {
		System.out.println("군번 " + milnum + "입니다.");
	}


	void fight() {
		System.out.println("전투");
	}
	
}
