package collectiontest;

import java.util.LinkedList;

public class LinkedListTest1 {
	
	public static void main(String[] args) {
		 LinkedList<String> arrName = new LinkedList<>();
		 arrName.add("전두환");
		 arrName.add("김영삼");
		 arrName.add("전두환");
		 arrName.add(1, "노태우");
		 System.out.println(arrName);
		 
		 // arrName.add(0, "대통형");
		 arrName.addFirst("대통령");
		 System.out.println(arrName);
//		 arrName.get();
//		 arrName.getFirst();;
		 arrName.get(arrName.size()-1);
		 System.out.println(arrName.getLast());
		 
		 
		// 449 hasnext .. next .. remove 
		 
		 
		
	} //main
} // class
