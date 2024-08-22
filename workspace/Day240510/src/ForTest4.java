
public class ForTest4 {

	public static void main(String[] args) {
		// 1부터 100까지 반복
		// 언제 합계가 100이 넘는지
		
		int sum = 1;
		int i, j;
		for(i = 1, j = 2; i<100; i++, j++) {
			System.out.printf("%02d번째: %d + %d = %d\n", i, sum, j, sum + j);
			sum += j;
			if(sum > 100) {
				break;
			}
		}
		
		System.out.printf("100은 %d째부터 넘음 " + sum, i);
		
	}

}
