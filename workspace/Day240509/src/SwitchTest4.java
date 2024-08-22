import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		
		System.out.print("랭킹: ");
		// 1등이면 대상 2,3등은 우수상, 4,5등은 장려상 그 밖에 참가상
		switch(ranking) {
		case  1   -> System.out.println("금메달");
		case  2   -> System.out.println("은메달");
		case  3   -> System.out.println("동메달");
		case  4,5 -> System.out.println("장려상");
		default   -> System.out.println("참가상");
		}
			
		sc.close();
	} // main
} // class
