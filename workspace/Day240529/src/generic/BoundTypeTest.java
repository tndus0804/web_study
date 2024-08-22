package generic;

public class BoundTypeTest {
	
	public static void main(String[] args) {
		int result = max(4, 5);
		System.out.println(result);
		
		String str = max("a", "z");
		System.out.println(str);
		
		//max(new IntBox(1), new IntBox(3));
		
		
	} // main
	
	static <T extends Comparable<T>> T max(T a, T b) {
		if(a.compareTo(b) > 0) {
			return a;
		}
		else {
			return b;			
		}
	}
	
	
	
} // class
