public class LoopTest1 {

	public static void main(String[] args) {
		// 1부터 10까지 더한 값
//		int result = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			result = result + i;
		}
		System.out.print(result);
	}

}
