package system;

public class TimeTest {

	public static void main(String[] args) {
		// 시간 측정
		// 시작
		long start = System.currentTimeMillis();
//		System.out.println("시작시간" + start);
		
		// 작업중
		for(int i = 0; i<100000; i++) {
			System.out.println(i + "번째 줄");
		}
		
		// 끝
		long end = System.currentTimeMillis();
//		System.out.println("끝 시간 " + end);
		System.out.println((end - start) / 1000.0 + "초 걸림");
		
		
		
		
	} // main
} // class
