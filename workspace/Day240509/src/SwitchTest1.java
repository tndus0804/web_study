import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("랭킹: ");
		int ranking = sc.nextInt();
		
		// 1이면 금메달, 2면 은메달, 3이면 동메달 그 밖에 참가상
		switch(ranking) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;
		default:
			System.out.println("참가상");
			break;
		}
				
		/*
		rank:if (ranking == 1) {
			System.out.println("금메달");
		} else if (ranking == 2) {
			System.out.println("은메달");
		} else if (ranking == 3) {
			System.out.println("동메달");
		} else {
			System.out.println("참가상");
		}
		*/

		sc.close();
	} // main
} // class
