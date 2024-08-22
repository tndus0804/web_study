
public class ForTest5 {

	public static void main(String[] args) {
		// 구구단 화면 출력
		// ex) 2 X 1 = 2
		//     2 X 2 = 4
		
		/*
		// 1부터 9까지 반복 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println(i+"단");
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
            if(i==9)
            	continue;
            System.out.println();
        }
		*/
		
		// 4단 ~ 7단까지 3 ~ 7까지만
		// 4 X 3 ~ 4 X 7
		
		for(int dan = 4; dan<=7; dan++) {
			for(int num = 3; num<=7; num++) {
				System.out.println(dan + " X " + num + " = " + dan*num);
			}
			System.out.println();
		}
		
		
		
		
		
		/*
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%02d ", i*j);
			}
			System.out.println();
		}
		*/
		
		
	}
	
	

}
