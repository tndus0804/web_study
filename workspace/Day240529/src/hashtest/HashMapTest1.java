package hashtest;

import java.util.HashMap;

public class HashMapTest1 {
	
	public static void main(String[] args) {
		// HashMap<K, V>
		// K = key, V = value
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어 땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 450);
		snack.put("뺴뺴로", 900);
		
		System.out.println(snack);
		
		String mySnack = "핫브레이크";
		System.out.println(mySnack + "의 가격은 " + snack.get(mySnack) + "원");
		
		
	} // main
} // class
