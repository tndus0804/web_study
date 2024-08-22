

public class CastTest1 {
	public static void main(String[] args) {
		// 자동 형변환		
		// 정수
		// byte (1)
		// short(2)
		// int  (4)
		// long (8)
		// 크기가 작은 타입이 큰 타입에 대입되는것은 OK
//		long l = i;
		// 크기가 큰 타입이 작은 타입에 대입되는 것은 ERROR
		// 강제형변환은 가능
//		short s = l;
		
		// 덜 정밀한 타입이 더 정밀한 타입에 대입되는 것은 OK
		// 정수 타입이 실수 타입에 대입되는 것은 OK
//		int i = 5;
//		double d = 5;
		
		// 더 정밀한 타입이 덜 정밀한 타입에 대입되는 것은 ERROR
		// 실수 타입이 정수 타입에 대입되는 것은 ERROR
		// 강제형변환은 가능
//		s = d;
		
		// 실수
		//float(4)
		//double(8)
		double d = 3.14; 
		float f = (float)d; 
		System.out.println(f);
		
	} // main
}