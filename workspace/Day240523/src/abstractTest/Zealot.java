package abstractTest;

public class Zealot extends Unit {
	
	@Override
	void move() {
		System.out.println("질럿 움직인다.");
	}
	
	@Override
	void attack() {
		System.out.println("질럿 공격");
	}
	
} // class
