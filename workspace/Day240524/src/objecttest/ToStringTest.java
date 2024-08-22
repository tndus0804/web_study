package objecttest;

import java.util.Scanner;

public class ToStringTest {
	
	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "김상형");
		System.out.println(kim);
		
		Human hong = new Human(15, "홍길동");
		System.out.println(hong);
		
		int[] arr = {1, 2, 3};
		System.out.println(arr);
		
		Scanner sc = new Scanner(System.in);
		
		
	} // main
} // class
