package hashtest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		HashSet<String> kangwon = new HashSet<>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");

		// 데이터 존재 여부
		System.out.println(kangwon.contains("춘천시"));
		
		Iterator<String> iter = kangwon.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
	} // main
} // class
