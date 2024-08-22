import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1을 입력했다.");
			break;
		case 2:
			System.out.println("2를 입력했다.");
			break;
		default:
			System.out.println("1 또는 2를 입력하세요.");
			break;
		}
		sc.close();
	} // main
} // class
