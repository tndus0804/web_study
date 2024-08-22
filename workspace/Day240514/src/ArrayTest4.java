
public class ArrayTest4 {

	public static void main(String[] args) {
		// 학생 5명의 성적 저장
//		int[] scores = new int[5];
//		scores[0] = 88;
//		scores[1] = 99;
//		scores[2] = 79;
//		scores[3] = 55;
//		scores[4] = 100;
//		int[] scores = new int[] {88, 99, 79, 55, 100}; // 방법 ①
//		int[] scores = {88, 99, 79, 55, 100};			// 방법 ②
		int[] scores;									//
		scores = new int[] {88, 99, 79, 55, 100};		// 방법 ③
		
		System.out.println("학생 수" + scores.length);
		// 배열
		for(int i = 0; i < scores.length; i++) {
			// 반복할 코드
			System.out.println((i + 1) + "번째 학생 점수 : " + scores[i]);
		}
		

		
		
		
		
		
		
		
	} // main

}
