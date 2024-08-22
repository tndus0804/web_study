import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 한 학급의 랭킹에 따라 성적표 발행 
		// 번호 순서로 출력되도록
		// 1. 학급의 인원수 입력
		// 2. 1번부터 랭킹(등급) 매김
		// 3. 전체 학생의 성적표 출력
		
		// 1. 학급의 인원수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 인원: ");
		// 2. 학생 1번부터 등급을 매김
		int stdNum = sc.nextInt();
		int[] student = new int[stdNum];
		
		for(int i = 0; i<student.length; i++) {
			System.out.print((i + 1) + "번 학생의 등급: ");
			student[i] = sc.nextInt();
		}
		// 3. 전체 학생의 성적표 출력
		String[] message = {"", "최고의 성적"
							  , "우수한 성적"
							  , "보통 성적"
							  , "부진한 성적"
							  , "노력합시다"};
		
		for(int rank: student) {
			System.out.println(message[rank]);
		}
		
		
		
		
		
		sc.close();
	} // main

}