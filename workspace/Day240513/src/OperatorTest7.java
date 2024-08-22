
public class OperatorTest7 {

	public static void main(String[] args) {
		// 논리 연산자
		// && : and(그리고)
		// 조건식1 && 조건식2
		// true  true  => true
		// false true  => false
		// true  false => false
		// false false => false
		// || : or (또는)
		// 조건식1 || 조건식2
		// true  true  => true
		// false true  => true
		// true  false => true
		// false false => false
		// !  : not(부정)
		// !조건식 : true  => false
		//         false => true
		
		int value = 8;
		// 5 ~ 10 : 5 <= value <= 10
//		if(5 <= value <= 10) {
		if(5 <= value && value <= 10 && value % 2 != 0) {
			System.out.println("5 ~ 10 사이고 홀수다.");
		}
		else {
			System.out.println("범위 안에 없음");
		}
		
		
		
		
		
		
	}// main

}
