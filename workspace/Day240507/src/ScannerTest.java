import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*
		 * nextInt()	정수를 입력받는다
		 * nextDouble() 실수를 입력받는다
		 * nextLine()	문자열을 입력받는다
		 * nextBoolean	true, false 중 하나를 입력받는다.
		 * */
		Scanner sc = new Scanner(System.in);
		// 나이를 입력받기
		System.out.print("나이: ");
		int num = sc.nextInt();
		
		System.out.println("당신의 나이는 " + num);
		
		
		
		sc.close();
	}

}
