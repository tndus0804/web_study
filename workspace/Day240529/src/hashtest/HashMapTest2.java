package hashtest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// 기부한 사람과 금액
		Human kim = new Human(29, "김상형", 10000);
		Human hong = new Human(15, "홍길동", 20000);
		Human lee = new Human(42, "이이", 50000);
		
		HashMap<Integer, Human> donate = new HashMap<>();
		donate.put(kim.myCode, kim);
		donate.put(hong.myCode, hong);
		donate.put(lee.myCode, lee);
		
		Set<Integer> keySet = donate.keySet();		
		Iterator<Integer> iter = keySet.iterator();
		
		int key = 0;
		while(iter.hasNext()) {
			key = iter.next();
			System.out.println("Key: " + key + " Value: " + donate.get(key));
		}
	
		
		
		
		
		
		
		
	} // main
	
} // class
