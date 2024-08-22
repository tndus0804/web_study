
public class Car {
	// 속성(필드, 멤버 변수)
	String name;         // 자동차 이름
	boolean gasoline;    // 가솔린 여부
						 // true==휘발유, false==경유
	
	/*
//	Car() {
//		System.out.println("객체 생성");
//	}
//	@Override
//	protected void finalize() throws Throwable {
//		System.out.println("객체 소멸");
//	}
	 */
	
	// 기능
	void run() {
		if(gasoline) {
			System.out.println("부릉부릉");
		}
		else {
			System.out.println("덜컹덜컹");
		}
	}
	
	void stop() {
		System.out.println(name + " 끼이익");
	}
	
} // class
