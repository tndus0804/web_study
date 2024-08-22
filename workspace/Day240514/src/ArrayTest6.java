
public class ArrayTest6 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {88, 99, 70, 55, 100};
		
//		for(int i = 0; i < scores.length; i++) {
//			// 반복할 코드
//			System.out.println((i+1) + "번 학생 점수: " + scores[i]);
//		}
		
		// 향상된 for문, 강화된 for문, for each 문
		int total = 0;
		for(int score : scores) {
			total += score; // total = total + score;
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + ((double)total / scores.length));
		
		
	} // main

}
