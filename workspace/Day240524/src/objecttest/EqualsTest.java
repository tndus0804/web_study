package objecttest;

public class EqualsTest {
	
	public static void main(String[] args) {
		// ==
		int num = 10;
		
		if(num == 10) {
			System.out.println("num은 10이랑 같다.");
		}
		
		Human kim = new Human(29, "김상형");
		Human kim2 = kim;
		// 참조형: 주소값 같은지 비교
		if(kim == kim2) {
			System.out.println("kim과 kim2는 같다.");
		}
		
		Human hong = new Human(15, "홍길동");
		Human hong2 = new Human(16, "홍길동");
		
		if(hong == hong2) {
			System.out.println("같다 ==");
		}
		
		// 비교대상1.equals(비교대상2)
		if(hong.equals(hong2)) {
			System.out.println("같다 equals");
		}
	} // main
} // class
