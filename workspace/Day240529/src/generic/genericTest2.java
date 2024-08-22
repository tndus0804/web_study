package generic;

import java.util.ArrayList;

public class genericTest2 {
	
	public static void main(String[] args) {
		IntBox bi = new IntBox(1234);
		int biv = bi.get();
		System.out.println(biv);
		
		DoubleBox bd = new DoubleBox(3.14);
		double bdv = bd.get();
		System.out.println(bdv);
		
		ObjectBox bio = new ObjectBox(1234);
		int biov = (int) bio.get();
		System.out.println(biov);
		
		
		
		
		
	} // main
} // class
