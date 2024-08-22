package bustest;

public class Bus {
	// 속성
	static final long GIGA = 10000000000L;
	
	final int BUS_OF_NUMBER; // 차량번호
	boolean gasoline;
	static int busNum;
	static Station[] arrInfo;
	
	public Bus(int busOfNumber) {
		this.BUS_OF_NUMBER = busOfNumber;
	}
	
	static {
		busNum++;
		arrInfo = new Station[7];
		arrInfo[0] = new Station("경희대학교", 0, 0);
		arrInfo[1] = new Station("청량리", 4, 200);
		arrInfo[2] = new Station("제기동", 7, 100);
		arrInfo[3] = new Station("답십리", 12, 200);
		arrInfo[4] = new Station("금호동", 16, 200);
		arrInfo[5] = new Station("옥수", 18, 150);
		arrInfo[6] = new Station("압구정", 23, 300);
	}
	
	// 기능
	
	static void printNum() {
//		System.out.println(gasoline);
		busNum++;
		System.out.println(busNum);
//		printFare(1, 5); // 호출 불가
		method1();
	}
	
	static void method1() {
		System.out.println("정적 메서드");
	}
	
	void printFare(int from, int to) {
		if((from < 0 || from > 6) || (to < 0 || to > 6)) {
			System.out.println("0~6숫자를 입력해주세요");
			return;
		}
		
		int fare = 500;
		for(int i = from; i<=to; i++) {
			fare += arrInfo[i].fare;
		}
		
		
		System.out.println(arrInfo[from].name +"~" + 
						arrInfo[to].name + "까지의 요금은 " + fare + "원입니다.");
		
	}
} // class
