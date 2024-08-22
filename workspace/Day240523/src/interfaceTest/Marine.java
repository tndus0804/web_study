package interfaceTest;

public class Marine implements Unit {
	
	@Override
	public void move() {
		System.out.println("마린 움직인다.");
	}
	
	@Override
	public void attack() {
		System.out.println("마린 공격");
	}
	
	void bunker() {
		System.out.println("마린 벙커");
	}
	
} // class
