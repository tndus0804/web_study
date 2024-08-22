package generic;

import java.util.ArrayList;

public class GenericMethodTest2 {
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("대한");
		array.add("민국");
		array.add("우리");
		array.add("나라");
		
		dumpArray(array);
		
	} // main
	
	static <T> void dumpArray(ArrayList<T> arr) {
		for(T t : arr) {			
			System.out.println(t);
		}
	}
	
	
} // class
