
public class MethodTest6 {

	public static void main(String[] args) {
		// 정수 두개 중에서 큰 수
		System.out.println(getMax(5, 3));
		// 실수 두개 중에서 큰 수
		System.out.println(getMax(4.14, 3.14));
		
	} // main
	
	// 메서드 오버로딩(시그니처를 확인: (파라미터의 데이터 타입과 갯수))
	static int getMax(int num1, int num2) {
		if(num1 > num2)
			return num1;
		return num2;
	}
	
	static double getMax(double num1, double num2) {
		if (num1 > num2)
			return num1;
		return num2;
	}
}
