package consoletest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		
		try {
			int score = sc.nextInt();
			System.out.println(score);
		} catch(InputMismatchException e) {
			System.out.println("input error");
		}
		
		
		System.out.println("프로그램 종료");
		
		
	} // main
} // class
