package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest5 {
	
	public static void main(String[] args) {
//		int[] num = {1, 2, 3};
//		List<Integer> asList = new ArrayList<>()
		List<Integer> list = Arrays.asList(1, 2, 3, 4);


		ArrayList<Integer> arrNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		arrNum.add(5);
		System.out.println(arrNum);
		
		Integer[] arr = new Integer[arrNum.size()];
		arrNum.toArray(arr);
		
		System.out.println(arrNum);
		System.out.println(arr[2]);
		
		List<Integer> subList = arrNum.subList(1, 4);
		System.out.println(subList);
		
		
		
		
		
	} //main
} // class
