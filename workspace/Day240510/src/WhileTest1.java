import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// 학년을 입력을 받아서 1~6을 입력하지 않을 경우 다시 입력하도록
		// ctrl shift n
		// ctrl shift o
		Scanner sc = new Scanner(System.in);
		
		int grade;
		while(true) {
			System.out.print("몇 학년?(1~6): ");
			grade = sc.nextInt();
			if(grade >= 1 && grade <= 6) {
				break;
			}
			System.out.println("* 다시 입력하세요");
		}
		
		System.out.println(grade + "학년입니다.");
		sc.close();
	} // main
} // class
