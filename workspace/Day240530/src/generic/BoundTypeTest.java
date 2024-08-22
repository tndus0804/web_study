package generic;

public class BoundTypeTest {
	
	public static void main(String[] args) {
		int result = max(4, 5);
		System.out.println(result);
		
		String str = max("a", "z");
		System.out.println(str);
		
		//max(new IntBox(1), new IntBox(3));
		
		Human older = max(new Human(29, "김상형"), new Human(15, "홍길동"));
		System.out.println(older.age + "살 " + older.name);
		System.out.println(older);
		
		
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
