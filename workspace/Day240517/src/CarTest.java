
public class CarTest {
	
	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도";
		korando.gasoline = true;
		System.out.print(korando.name + ": ");
		korando.run();
		
		Car equus = new Car();
		System.out.println(equus);
		equus.name = "에쿠스";
		equus.gasoline = false;
		System.out.print(equus.name+": ");
		equus.run();
		
		// 책 236p
		
	} // main
	
} // class
