package interfaceTest;

public class Mutal implements Unit {
	
	@Override
	public void move() {
		System.out.println("뮤탈 움직인다.");
	}
	
	@Override
	public void attack() {
		System.out.println("뮤탈 공격");
	}
	
} // class
