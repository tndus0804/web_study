package collectiontest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest2 {
	
	public static void main(String[] args) {
		// 449 hasnext .. next .. remove 
		List<String> arrName = new LinkedList<>();
		arrName.add("전두환");
		arrName.add("김영삼");
		arrName.add("김대중");
		arrName.add(1, "노태우");
		System.out.println(arrName);
		
		Iterator<String> iter = arrName.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=====================================");
//		ListIterator<String> listIter = arrName.listIterator(); // 순방향
		ListIterator<String> listIter = arrName.listIterator(arrName.size()); // 역방향
//		while(listIter.hasNext()) {     // 순방향
		while(listIter.hasPrevious()) { // 역방향
//			System.out.println(listIter.next());     // 순방향
			System.out.println(listIter.previous()); // 역방향
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //main
} // class
