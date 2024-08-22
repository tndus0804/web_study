package utility.string;

public class StringCompareToTest {

	public static void main(String[] args) {
		String apple = "Apple";
		String orange = "Orange";
		
		// 사전순으로 전후관계를 비교하여 
		int result = apple.compareTo(orange);
		System.out.println(result);
		
		if(result == 0) {
			System.out.println("같다");
		}
		else if(result < 0) {
			System.out.println("Apple이 더 앞쪽");
		}
		
		
		
		
		
		
		
		
		
		
		
	} // main
} // class
