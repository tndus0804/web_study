
public class MethodTest5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int sum = 0;
		// 1부터 10까지 더하기
		printSum(1, 10);
		
		// 15부터 100까지 더하기
		printSum(15, 100);
		
		// 44부터 78까지
		printSum(44, 78);
	} // main
	
	
	static void printSum(int from, int to) {
		// from부터 to까지의 합계를 반환
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from+"~"+to+"까지 합: " + sum);
	} // printSum
} // class
