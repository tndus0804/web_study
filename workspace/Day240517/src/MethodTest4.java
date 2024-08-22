

public class MethodTest4 {

	public static void main(String[] args) {
		int sum = 0;
		sum = calcSum(1, 10);
		// 1부터 10까지 더하기 
		System.out.println("1~10까지 합: " + sum);
		// 15부터 100까지 더하기
		System.out.println("15~100까지 합: " + calcSum(100, 15));  
		System.out.println("15~100까지 합: " + calcSum(15, 100));  
	} // main
	
	static int calcSum(int from, int to) {
		// from부터 to까지의 합계를 반환
		
		// 212p
		if(from > to) {
			// 자리 바꿔죽 from <-> to
			int temp = from;
			from = to;
			to = temp;
		}
		
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}
