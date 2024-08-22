package interfaceTest;

public class Zealot implements Unit {
	
	@Override
	public void move() {
		System.out.println("질럿 움직인다.");
	}
	
	@Override
	public void attack() {
		System.out.println("질럿 공격");
	}
	
} // class
