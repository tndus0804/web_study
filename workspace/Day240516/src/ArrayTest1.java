import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 달을 입력 받아서 며칠까지 있나
		Scanner sc = new Scanner(System.in);
		System.out.print("월: ");
		int month = sc.nextInt();
		
		int[] arrDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month <=0 || month>12) {
			System.out.println("1~12의 숫자를 입력해주세요.");
			sc.close();
			return;			
		}
		
		int days = arrDays[month-1];
		
		System.out.println(month + "월은 " + days + "일까지 있습니다.");
		
		
		
		
		
		
		sc.close();
	} // main

}