package serialtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		Car pride = new Car("프라이드", "파랑");
		System.out.println(pride.color);
		
		// 파일로 출력
		FileOutputStream fos = new FileOutputStream("pride.car"); 
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		oos.writeObject(pride);
		oos.close();
		System.out.println("파일로 기록");
		
		// 파일로부터 가져오기
		FileInputStream fis = new FileInputStream("pride.car");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car pride2 = (Car)ois.readObject();
		ois.close();
		pride2.outInfo();
		System.out.println(pride2.color);
		
//		File file = new File("pri.txt");
		
		
		
	} // main
} // class
