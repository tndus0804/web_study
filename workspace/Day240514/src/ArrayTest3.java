
public class ArrayTest3 {

	public static void main(String[] args) {
		// 학생 5명의 성적 저장
//		int score1 = 88;
//		int score2 = 99;
//		int score3 = 79;
//		int score4 = 55;
//		int score5 = 100;
		int[] scores = new int[5];
		scores[0] = 88;
		scores[1] = 99;
		scores[2] = 79;
		scores[3] = 55;
		scores[4] = 100;
		System.out.println("학생 수" + scores.length);
		
		
		// 출력
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		// 배열
		for(int i = 0; i < scores.length; i++) {
			// 반복할 코드
			System.out.println((i + 1) + "번째 학생 점수 : " + scores[i]);
		}
		

		
		
		
		
		
		
		
	} // main

}
