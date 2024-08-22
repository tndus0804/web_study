package interfaceTest;

public class Test1 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Unit[] arrUnit = { 
				new Marine(),
				new Zealot(),
				new Mutal(),
				new Dark()
			};
		
		// Unit u = new Marine();
		// 상속 관계 : 부모타입 변수명 = new 자식타입();
		// 구현 관계 : 인터페이스 변수명 = new 구현한클래스();
		Hidable h = new Dark();
		
		for(Unit u : arrUnit) {
			u.move();
			u.attack();
		}

	} // main
} // class
