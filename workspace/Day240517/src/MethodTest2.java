

import java.util.Scanner;

public class MethodTest2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 연도(year)를 입력받아서
		// 메서드를 호출하여 2월의 말일 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("몇년? ");
		int year = sc.nextInt();
		int month = 2;
		
		int day = getDays(year);
		System.out.println(year + "년의 2월은 " + day + "일까지 있습니다.");
		
		// 메서드 207p
		
		sc.close();
	} // main
	
	static int getDays(int year) {
		// 윤년: 29일 그외: 28일
		// 4년에 한번이고 100년에 한번 오는건 윤년이 아님
		// 400년에 한번
		// 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다. (즉, 끝 두 자리가 00이면서 윗 자리가 4의 배수가 되는 해)
		//
		if((year % 4 == 0 && year%100 != 0) || year % 400 == 0) {
//		if(year % 4 == 0 && (year%100 == 0 && year % 400 == 0)) {
			return 29;
		}
		return 28;					
	} // getDays

} // class
