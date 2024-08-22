import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// % : 나머지 연산자(MOD연산자)
//		System.out.println(10 / 4);
		
		// 정수를 입력 받아 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		System.out.print(num % 2 == 0 ? "짝수" : "홀수");
		sc.close();
	} // main
} // class
