
public class WhileTest2 {

	public static void main(String[] args) {
		// 1부터 100까지 홀수들의 합
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i+=2;
		}
		System.out.println("홀수의 합" + sum);
		
		
		
		// 1부터 100까지 짝수들의 합
		i = 2;
		sum = 0;
		while(i <= 100) {
			sum += i;
			i+=2;
		}
		System.out.println("짝수의의 합" + sum);
		
	}

}
