import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 학생 5명의 성적 입력받아서 저장 후 총점과 평균 출력
		//{88, 99, 79, 55, 100};
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수:");
		int stdNum = sc.nextInt();
		// 배열 초기화
		int[] scores = new int[stdNum];
		// 성적 입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+"번 학생 점수: ");
			scores[i] = sc.nextInt();
		}
		// 총점
		int total = 0;
		// 성적 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번쨰 학생 점수: " + scores[i]);
			total += scores[i]; // total = total + score[i];
		}
		
		// 총점과 평균
		double avg = total / (double)stdNum;
//		System.out.println("총점: " + total + " 평균: " + avg);
//		System.out.println("평균: " + total / (double)stdNum);
//		System.out.printf("쓰고 싶은 문자열 +연산자로 잇지 않고",,,,);
		// 정수 %d, 실수 %f, 문자열 %s, 개행 %n \n
		// 소수점 두자리까지만 출력 : %.2f
		System.out.printf("총점: %d 평균: %.2f", total, avg);
		sc.close();
	} // main
} // class
