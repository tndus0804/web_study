package hashtest;

import java.util.HashMap;

public class HashMapTest3 {

	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42, "김기남", 10000), 10000);
		donate.put(new Human(24, "박수빈", 20000), 20000);
		donate.put(new Human(20, "박수현", 5000), 5000);
		
		Human park = new Human(20, "박수현", 5000);
		System.out.println(park.name + "씨의 기부금: " + donate.get(park));
		
		
		
		
	} // main
	
} // class
