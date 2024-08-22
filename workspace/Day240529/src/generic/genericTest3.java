package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class genericTest3 {
	
	public static void main(String[] args) {
		Box<String> bi = new Box<>("1234");
		System.out.println(bi.get());
		
		Box<Double> bd = new Box<>(3.14);
		System.out.println(bd.get());
		
		System.out.println(bi.getClass());
		System.out.println(bd.getClass());
		
		
		
		
		
		
	} // main
} // class
