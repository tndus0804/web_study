import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력받은 정수들의 누적 합계
		// 0을 입력하면 덧셈 종료.
		
		Scanner sc = new Scanner(System.in);
		int num = 0; // 입력 받아서 대입할 변수
		int total = 0; // 누적 합계
		
		do {
			System.out.print("정수: ");
			num = sc.nextInt();
			total += num;
		} while (num != 0);
		
		System.out.print("누적된 합계: " + total);
		sc.close();
	} // main
} // class
