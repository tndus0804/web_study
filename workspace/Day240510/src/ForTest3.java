
public class ForTest3 {

	public static void main(String[] args) {
		// 10부터 1까지 찍기 가로로 출력 구분자,
		// 10, 9, 8, ... 2, 1,
		for(int i = 10; i >= 1; i--) {
			if(i == 1) {
				System.out.println(i);
				continue;
			}
			System.out.print(i + ", ");
		}
//		System.out.println("");
		
		// 0.0, 0.5, ... 2.5
		for(double d = 0.0; d <= 2.5; d += 0.5) {
			if(d == 2.5) {
				System.out.print(d);
				continue;
			}
			System.out.print(d + ", ");
		}
		
	}

}
