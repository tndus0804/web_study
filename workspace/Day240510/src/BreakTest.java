
public class BreakTest {

	public static void main(String[] args) {
		
		// 3단의 X 4할때 빠져나가기
		label:		
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println(dan+"단");
            for(int num = 1; num <= 9; num++) {
            	if(dan == 3 && num == 4) {
            		break label;
            	}
                System.out.printf("%d X %d = %d\n", dan, num, dan*num);
            }
            if(dan==9)
            	continue;
            System.out.println("------------------------");
        }
		
		System.out.println("프로그램 종료");
		
	} // main
} // class
