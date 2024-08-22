
public class ReferenceTest4 {

	public static void main(String[] args) {
		// 책 190p
		// 참조형의 복사
		int[] ar = {1, 2, 3};
		int[] ar2 = {1, 2, 3};
		int[] ar3 = ar;
		
//		System.out.println(ar);  // 주소값 출력
//		System.out.println(ar2); // 주소값 출력
//		System.out.println(ar3); // 주소값 출력
		ar2[1] = 33;
		System.out.println(ar2[1]);
		System.out.println(ar[1]);
		System.out.println(ar3[1]);
		System.out.println(ar == ar2); // 주소값 비교
		System.out.println(ar == ar3); // 주소값 비교
		
	} // main

} // class
