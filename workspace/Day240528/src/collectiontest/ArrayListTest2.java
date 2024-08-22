package collectiontest;

import java.util.ArrayList;

public class ArrayListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrNum = new ArrayList<>();
		
		// 30개 랜덤 숫자
		for (int i = 0; i < 30; i++) {
			arrNum.add((int) (Math.random() * 10));
		}
		System.out.println(arrNum);
		/*
		arrNum.clear();
		// 30개 랜덤 숫자
		for (int i = 0; i < 10; i++) {
			int d = (int) (Math.random() * 15);
			if (arrNum.indexOf(d) != -1) {
				i--;
//						System.out.println(i + "숫자 겹침");
				continue;
			}
			System.out.println(i + "숫자 안겹침");
			arrNum.add(d);
		}
		System.out.println(arrNum);
		 */
		for(int i : arrNum) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 8번 인덱스 값을 출력
		// 배열 : System.out.println(arrNum[8]);
		System.out.println(arrNum.get(8));
		
		
		// 8번 인덱스 값을 변경
		// 배열: arrNum[8] = 10;
		System.out.println(arrNum);
		System.out.println("set: " + arrNum.set(2, 100));
		arrNum.set(2, 100);
		System.out.println(arrNum);
		
		
		
		
	} //main
} // class
