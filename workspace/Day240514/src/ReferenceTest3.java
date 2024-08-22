import java.util.Arrays;

public class ReferenceTest3 {

	public static void main(String[] args) {
		// 책 190p
		// 참조형의 복사
		int[] ar = {1, 2, 3};
		int[] ar2 = ar;
		System.out.println("ar값:" + ar[1] + " " + Arrays.toString(ar));
		System.out.println("ar2값:" + ar2[1] + " " + Arrays.toString(ar2));
		
		// 사본 변경
		ar2[1] = 10;
		System.out.println("ar[1]값:" + ar[1] + " " + Arrays.toString(ar));
		System.out.println("ar2[1]값:" + ar2[1] + " " + Arrays.toString(ar2));
		
		// 원본 변경
		ar[2] = 20;
		System.out.println("ar[2]값:" + ar[2] + " " + Arrays.toString(ar));
		System.out.println("ar2[2]값:" + ar2[2] + " " + Arrays.toString(ar2));
		
		
		
		
		
		
	} // main

}
