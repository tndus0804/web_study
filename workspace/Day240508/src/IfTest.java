import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// ctrl shift w => 열려있는 모든 탭 닫기
		// 1을 입력하면 "1을 입력했다" 메시지 표시
		// 1이외의 정수를 입력하면 그냥 종료
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("1을 입력했다.");
		}
		sc.close();
	} // main
} // class
