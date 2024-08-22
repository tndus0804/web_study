package abstractTest;

public class Mutal extends Unit {
	
	@Override
	void move() {
		System.out.println("뮤탈 움직인다.");
	}
	
	@Override
	void attack() {
		System.out.println("뮤탈 공격");
	}
	
} // class
