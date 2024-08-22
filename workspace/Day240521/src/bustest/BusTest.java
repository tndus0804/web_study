package bustest;

public class BusTest {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		Bus.printNum();
		System.out.println(Bus.GIGA);
		Bus bus1 = new Bus(1001);
		bus1.printFare(1, 5);
		System.out.println(bus1.GIGA);
		
		Bus bus2 = new Bus(1002);
		bus2.printFare(2, 4);
		
		
	} // main
} // class