
public class OperatorTest1 {

	public static void main(String[] args) {
		int a = 6;
		int b = 4;
		System.out.println(a + " + " + b + " = " + a + b);   // 출력값: 6 + 4 = 64
		System.out.println(a + " + " + b + " = " + (a + b)); // 출력값: 6 + 4 = 10
		System.out.println(a + " - " + b + " = " + (a - b)); // 출력값: 6 - 4 = 2
		System.out.println(a + " x " + b + " = " + (a * b)); // 출력값: 6 x 4 = 24
		System.out.println(a + " ÷ " + b + " = " + (a / b)); // 출력값: 6 ÷ 4 = 1
		// 정수 나누기 정수 => 정수 (나머지 버림)
		// 정수 나누기 실수 or 실수 나누기 정수 or 실수 나누기 실수 => 실수
		System.out.println(a + " ÷ " + b + " = " + (6.0 / b)); // 출력값: 6 ÷ 4 = 1.5
		System.out.println(a + " ÷ " + b + " = " + (a / 4.0)); // 출력값: 6 ÷ 4 = 1.5
		System.out.println(a + " ÷ " + b + " = " + (6.0 / 4.0)); // 출력값: 6 ÷ 4 = 1.5
		// 형변환 int였던 a와 b를 double로 변환
		System.out.println(a + " ÷ " + b + " = " + ((double)a / b)); // 출력값: 6 ÷ 4 = 1.5
		System.out.println(a + " ÷ " + b + " = " + (a / (double)b)); // 출력값: 6 ÷ 4 = 1.5
		System.out.println(a + " ÷ " + b + " = " + ((double)a / (double)b)); // 출력값: 6 ÷ 4 = 1.5
		
	
		System.out.println(a + " ÷ " + b + " = " + (double)(a / b)); // 출력값: 6 ÷ 4 = 1.0
		// a÷b => 1이 된 후에 double로 형변환 했기 떄문에 1.0으로 출력됨
		System.out.println(a + " % " + b + " = " + (a % b)); // 출력값: 6 % 4 = 2
		
		
		
		
		
	}

}
