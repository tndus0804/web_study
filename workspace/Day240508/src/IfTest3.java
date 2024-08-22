import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// 1을 입력하면 "1을 입력했다" 메시지 표시
		// 2을 입력하면 "2을 입력했다" 메시지 표시
		// 1 또는 2 이외의 정수를 입력하면 "1 또는 2를 입력하세요."
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("1을 입력했다.");
		} else if(num == 2) {
			System.out.print("2를 입력했다.");
		} else {
			System.out.print("1 또는 2를 입력하세요.");
		}
		
//		if(num == 1 || num == 2) {
//			System.out.print(num + (num == 1 ? "을" : "를") + "입력했다.");
//		}
		sc.close();
	} // main
} // class
