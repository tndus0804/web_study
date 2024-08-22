
public class ParameterTest1 {

	public static void main(String[] args) {
		// 메서드 호출하면서 정수를 보내면 두배로 리턴		
		// 기본형 변수
		int num = 5;
		getDouble(num);
		System.out.println(num);
		
	} // main


	static int getDouble(int value) {
		return value * 2;
	}
} // class
