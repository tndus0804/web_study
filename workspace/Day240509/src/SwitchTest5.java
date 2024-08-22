import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 카드 유무 유: 탕수육, 무: 현금이 얼마 있냐
		// 현금이 얼마 있냐? 5000원 이상 짬뽕 5000원 미만 짜장면
		boolean card = false;
//		boolean card = true;
		int money = 6000;
		
		if(card) {
			System.out.print("탕수육");
		}
		else {
			if(money >= 5000)
				System.out.print("짬뽕");
			else
				System.out.print("짜장면");
		}
		sc.close();
	} // main
} // class
