
public class Car {
	// 속성(필드, 멤버 변수)
	String name;         // 자동차 이름
	boolean gasoline;    // 가솔린 여부
						 // true==휘발유, false==경유
	static int carNum;
	
	// 기본(디폴트) 생성자
	// 생성자가 단 하나도 없으면 컴파일러가 만들어 줌.
//	public Car() {
//		
//	}
	
	// 사용자 정의 생성자
	public Car(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
		carNum++;
	}
	
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
