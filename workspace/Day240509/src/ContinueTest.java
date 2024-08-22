public class ContinueTest {

	public static void main(String[] args) {
		// 1부터 10까지 반복
		// i 값이 8일떄는 "8 찾았다!"
		// 그 외 나머지 i 값은 그냥 i값만 출력
		
		for(int i = 1; i<= 10; i++) {
			if(i == 8) {
				System.out.println("8 찾았다");
				continue;
			}
			System.out.println(i);
		}
		
		// 16부터 67까지 반복
		// i값이35일때는 "35 찾았다"
		// 그 외 나머지 i값은 그냥 i값만 출력
		for(int i = 16; i <= 67; i++) {
			if(i == 35) {
				System.out.println("35 찾았다");
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
