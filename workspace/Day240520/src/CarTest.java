
public class CarTest {
	
	public static void main(String[] args) {
		Car korando = new Car(" 코란도", true);
/*		korando.name = "코란도";
		korando.gasoline = true; */
//		System.out.println(korando.name + ": " + korando.carNum);
		System.out.println(korando.name + ": " + Car.carNum);
		
		Car equus = new Car("equus", false);
//		System.out.println(equus.name + ": " + equus.carNum);
		System.out.println(equus.name + ": " + Car.carNum);
		
		Car pride = new Car("프라이드", false);
//		System.out.println(pride.name + ": " + pride.carNum);
		System.out.println(pride.name + ": " + Car.carNum);
		// 책 270쪽
		
	} // main
	
} // class
