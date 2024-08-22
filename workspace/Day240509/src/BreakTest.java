public class BreakTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 1부터 100까지 더한 반복
		// 7을 찾으면 "7을 찾았다" 출력 후 반복문 종료
		int sum = 0;
		for (int i = 1; i<= 100; i++) {
			if(i == 7) {
				System.out.println("7을 찾았다");
				break;
			}
			System.out.println(i);
		}
		
		// 14부터 54까지 반복
		// 33찾으면 "33을 찾았다" 출력후 반복문 종료
		for(int i = 14; i <= 54; i++) {
			if(i == 33) {
				System.out.println("33을 찾았다");
				break;
			}
			System.out.println(i);
		}
		
	} // main
} // class
