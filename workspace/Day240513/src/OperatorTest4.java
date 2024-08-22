
public class OperatorTest4 {

	public static void main(String[] args) {
		System.out.println("응답하라 " + 19 + 88);		  // 응답하라 1988
		System.out.println("응답하라 " + (19 + 88)); 	  // 응답하라 107
		System.out.println(19 + 88 + " 응답하라");      // 107 응답하라
		System.out.println("" + 19 + 88 + " 응답하라"); // 1988 응답하라
	}

}
