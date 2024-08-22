import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("랭킹: ");
		int ranking = sc.nextInt();
		
		
		// 1등이면 대상 2,3등은 우수상, 4,5등은 장려상 그 밖에 참가상
		
		switch(ranking) {
		case 1:
			System.out.println("대상");
			break;
		case 2:
		case 3:
			System.out.println("우수상");
			break;
		case 4:
		case 5:
			System.out.println("장려상");
			break;
		default:
			System.out.println("참가상");
			break;
		}
				
		/*
		if (ranking == 1) {
			System.out.println("대상");
		} else if (ranking == 2 || ranking == 3) {
			System.out.println("우수상");
		} else if (ranking == 4 || ranking == 5) {
			System.out.println("장려상");
		} else {
			System.out.println("참가상");
		}
		*/
		
		sc.close();
	} // main
} // class
