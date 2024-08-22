
public class CastTest3 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 자동 형변환	
		byte b = 120;
		int i = 10;
		double d = i;
		System.out.println(d);
		
		// ERROR
		d = 3.14;
		System.out.println(d);
		// 강제형변환
		i = (int)d;
		System.out.println(i);
	} // main
} // class