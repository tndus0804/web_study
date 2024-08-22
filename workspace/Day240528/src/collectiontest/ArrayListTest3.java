package collectiontest;

import java.util.ArrayList;

public class ArrayListTest3 {
	
	public static void main(String[] args) {
		// 요소 삭제
		ArrayList<Integer> arrNum = new ArrayList<>();
		arrNum.add(3);
		arrNum.add(2);
		arrNum.add(1);
		System.out.println(arrNum);
		
		// 요소 삭제
		arrNum.remove(1); // 1번 인덱스 삭제
		arrNum.remove((Integer)1); // 요소가 1인 것을 삭제, 1이 여러개 있어도, 한번만
		System.out.println(arrNum);
		
//		int index = arrNum.indexOf(2);
		
		
		
		
		// t
		// 리스트에서 1을 모두 제거
//		arrNum.removeAll(new ArrayList<Integer>() {{ add(1); }});
		
	} //main
} // class
