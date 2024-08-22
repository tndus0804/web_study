
public class Practice3 {

	public static void main(String[] args) {
//		정수 중에서 5의 배수이자 7의 배수인 첫번째 수?
		// 1~20 중에서 3의 배수는 제외하고 출력하기
		int num = 1;
		while(true) {
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println(num);
		System.out.println();
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		
		
	}

}
