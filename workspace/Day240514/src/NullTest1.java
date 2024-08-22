
public class NullTest1 {

	public static void main(String[] args) {
		// 192p
		// null : 주소값(참조값)이 없는 상태
		int[] ar = {1,2,3};
		System.out.println(ar[1]);
		ar = null;
//		if(ar != null) {
//			System.out.println(ar[1]);
//		}
		
		String[] str = new String[3];
		System.out.println(str[2]);
		
		
		// java.lang.NullPointerException
	} // main
} // class
