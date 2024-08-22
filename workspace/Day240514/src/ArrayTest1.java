
public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 선언
		int[] scores; //권장하는	  방법
//		int scores[]; //권장하지 않는 방법
		
		// 배열 생성
		scores = new int[5];
		
		// 배열 접근 방법
		// 변수명[index]
		System.out.println(scores[2]);
		// 배열에 대입
		scores[2] = 100;
		System.out.printf(""+scores);
		

		System.out.println("\n\n\n"+java.util.Arrays.toString(scores));
		// java.lang.ArrayIndexOutOfBoundsException
		
		
		
		
	} // main

}
