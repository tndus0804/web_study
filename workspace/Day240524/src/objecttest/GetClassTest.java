package objecttest;

import java.lang.reflect.Field;

public class GetClassTest {
	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		
		Class cls = kim.getClass();
		System.out.println("클래스 이름: " + cls.getName());

//		Class cls2 = cls.getSuperclass();
//		System.out.println(cls2.getName());
		System.out.println("부모 클래스: " + cls.getSuperclass().getName());
		
		System.out.print("필드: ");
		Field[] fields = cls.getDeclaredFields();
		for(Field f : fields) {
			System.out.print(f.getName() + " ");
		}
		
		
		
		
		
	} // main
} // class
