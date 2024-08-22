
public class StarTest {

	public static void main(String[] args) {
		// *을 가로로 5개 찍기
		for (int i = 1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // main
} // class
