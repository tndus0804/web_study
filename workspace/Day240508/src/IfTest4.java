import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		// 성인 여부 검사
		Scanner sc = new Scanner(System.in);
		System.out.println("몇살? : ");
		int age;
		age = sc.nextInt();
//		age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("너 몇살이니?"));
		
		if(age >= 19) {
			System.out.print("성인입니다.");
		} else if(age>12) {
			System.out.println("청소년 입니다.");	
		} else {
			System.out.println("어린이 입니다.");	
		}
		
		sc.close();
	} // main
} // class
