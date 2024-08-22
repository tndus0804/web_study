import java.util.Scanner;

public class OperatorTest8 {

	public static void main(String[] args) {
		// (조건식) ? 참값 : 거짓값
		// 짝수 홀수 인지 판단
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
		sc.close();
	}// main
} // class
