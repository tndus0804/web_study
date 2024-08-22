
public class ParameterTest2 {

	public static void main(String[] args) {
		// 참조형 변수
		int[] num = {1, 2, 3};
		System.out.println("num의 주소값" + num);
		getDouble(num);
		System.out.println(num[1]);
		// 책 220 페이지
		System.out.printf("정수는 %d, 실수는 %.2f, 문자열은 %s\n", 10, 2.22222, "Hello");
		
		
		
		//getNum1(9, 10, 11, 1010101, 10, 20, 30, 33);
		
		System.out.println(java.util.Arrays.toString(num));
	} // main


	static int getDouble(int[] value) {
		System.out.println("value의 주소값" + value);
		value[1] *= 2; // value[1] = value[1] * 2;
		return value[1];
	}
	
//	static void getNum1(int ... value) {
//		value -> 배열?
//		System.out.println(java.util.Arrays.toString(value));
//	}

} // class
