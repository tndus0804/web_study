
public class ForTest2 {

	public static void main(String[] args) {
		// 1부터 100까지 홀수들의 합
		int sum = 0;
		
		for(int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("홀수의 합" + sum);
		
		
		
		// 1부터 100까지 짝수들의 합
		sum = 0;
		for(int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.print("짝수의 합" + sum);
		
	}

}
