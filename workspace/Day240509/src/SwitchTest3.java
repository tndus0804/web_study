import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country;
		
		iter1:while(true) {			
			System.out.print("나라: ");
			country = sc.next();
			
			switch(country.toLowerCase()) {
			case "korea":
				System.out.println("서울");
				break;
			case "japan":
				System.out.println("도쿄");
				break;
			case "china":
				System.out.println("베이징");
				break;
			case "exit":
				break iter1;
			}
		}
		sc.close();
	} // main
} // class
