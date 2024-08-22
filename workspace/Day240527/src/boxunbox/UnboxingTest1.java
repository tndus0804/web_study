package boxunbox;

public class UnboxingTest1 {

	public static void main(String[] args) {
		// 언박싱 : 참조형 -> 기본형
		Integer wrapInt = 629;
	int i = wrapInt;
//		int i = wrapInt.intValue();
		System.out.println(i);
		
		Double wrapDouble = 3.14;
		int di = wrapDouble.intValue();
		System.out.println(di);
		
		
		
		
		
		
	} // main
} // class
