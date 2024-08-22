import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// 1을 입력하면 "1 입력했다 메세지 표시
		// 1 이외의 정수를 입력하면 그냥 종료
		// ctrl shift alt o 한개 import
		// ctrl shift o 여러개 import
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("1을 입력했다");
		}
		
		sc.close();
	} // main

} // class
