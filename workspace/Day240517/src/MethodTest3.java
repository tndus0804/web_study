import java.time.LocalDate;

public class MethodTest3 {

	public static void main(String[] args) {
		//  오늘 날짜 구하기
		System.out.println("오늘은 " + getDate() + "일입니다.");
		
	} // main
	
	static int getDate() {
		LocalDate today = LocalDate.now();
		return today.getDayOfMonth();
		//System.out.println("ddd");
	}
	
	
}
