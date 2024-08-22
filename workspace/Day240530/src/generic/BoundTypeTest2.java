package generic;

public class BoundTypeTest2 {
	
	public static void main(String[] args) {
		Human h1 = new Human(15, "김상형");
		Human h2 = new Human(15, "홍길동");
		int result = max(h1, h2);
		if(result == 1) {
			System.out.println(h1.name + "이(가) 더 나이가 많다.");
		}
		else if(result == 0) {
			System.out.println("동갑이다.");
		} else {
			System.out.println(h2.name + "이(가) 더 나이가 더 많다.");	
		}
		
		
		
//		if(result == 0) {
//			System.out.println("동갑이다.");
//		}
//		else {
//			System.out.println(((result > 0) ? h1.name : h2.name) + "이(가) 더 나이가 더 많다.");
//		}
		
	} // main
	
	static <T extends Comparable<T>> int max(T a, T b) {
		if(a.compareTo(b) > 0) {
			return 1;
		}
		else if(a.compareTo(b) == 0) {
			return 0;
		}
		else {
			return -1;			
		}
	}
	
	
	
} // class
