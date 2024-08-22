package abstractTest;

public class Test1 {
	
	public static void main(String[] args) {
		Unit[] arrUnit = { 
							new Marine(),
							new Zealot(),
							new Mutal()
						};
		for(Unit u : arrUnit) {
			u.move();
			u.attack();
		}
		
		
		
		
	}
} // class
