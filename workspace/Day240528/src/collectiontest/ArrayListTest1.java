package collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		// list 넣은 순서대로, 중복허용 O
		ArrayList<Integer> arrNum = new ArrayList<Integer>();
		arrNum.add(1);
		arrNum.add(2);
		arrNum.add(3);
		System.out.println(arrNum);
		
		arrNum.add(3, 100);
		
		for(int i : arrNum) {
			System.out.println(i);
		}
		System.out.println(arrNum);
		
	} //main
} // class
