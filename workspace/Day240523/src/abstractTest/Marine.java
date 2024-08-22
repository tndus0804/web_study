package abstractTest;

public class Marine extends Unit {
	
	@Override
	void move() {
		System.out.println("마린 움직인다.");
	}
	
	@Override
	void attack() {
		System.out.println("마린 공격");
	}
	
	void bunker() {
		System.out.println("마린 벙커");
	}
	
} // class
