package collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {
	
	public static void main(String[] args) {
		// 
		List<String> arrName = new ArrayList<>();
		arrName.add("장보고");
		arrName.add("김유신");
		arrName.add("강감찬");
		arrName.add("을지문덕");
		
		// 반복자로 루프
		Iterator<String> iter = arrName.listIterator(); 
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println(arrName.get(0));
		
		// 사전순 정렬
//		Collections.sort(arrName);
		// 사전순 역정렬
		//(그냥 sort하면 순서만 바뀌기 떄문에, 
		// sort하고 reverse 해야 내림차순 정렬)
//		Collections.sort(arrName);
//		Collections.reverse(arrName);
		//무작위
		Collections.shuffle(arrName);
		
		
		
		System.out.println(arrName);
		System.out.println(arrName.get(0));
		
		
		
		
	} // main
} // class
