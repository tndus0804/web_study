import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 가장 큰 수 구하기
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3 = 0;
		System.out.print("첫 번째 정수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력: ");
		num3 = sc.nextInt();
		
		// 최댓값
		int max = num1;
		
		// num1과 num2를 비교
		if(num1 < num2) {
			max = num2;
		} 
		
		// num1과 num2비교 결과 큰 수와 num3를 비교
		if(max < num3) {
			max = num3;
		}
		
		System.out.print(num1 + ","+num2+","+num3+" 중 가장 큰 수는 " + max +"입니다.");
		sc.close();
	} // main
} // class
