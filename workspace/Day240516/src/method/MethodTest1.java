package method;

public class MethodTest1 {

	public static void main(String[] args) {
		int sum = 0;
		// 1부터 10까지 더하기
		sum = calcSum(1, 10);
//		for(int i = 1; i<= 10; i++) {
//			sum+=i;
//		}
		System.out.println("1~10까지 합: " + sum);
		
		// 15부터 100까지 더하기
//		sum = calcSum(15, 100);
//		sum = 0;
//		for(int i = 15; i <= 100; i++) {
//			sum += i;
//		}
		System.out.println("15~100까지 합: " + calcSum(15, 100));
		
		
		// 책 205p
		
		
	} // main
	
	
	static int calcSum(int from, int to) {
		// from부터 to까지의 합계를 반환
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		//System.out.println(from + "~" + to + "까지 합: " + sum);
		return sum;
	}
	
//	static void calcSum(int to) {
//		// 1부터 숫자 to까지의 합
//		int sum = 0;
//		for (int i = 1; i <= to; i++) {
//			sum += i;
//		}
//		//System.out.println("1~" + to + "까지 합: " + sum);
//	}
	
	
	
	
	

}
