package abstractTest;

public abstract class Unit {
	int health;

	abstract void move();
	abstract void attack();
	
	void intro() {
		System.out.println("인트로");
	}
	
} // class
