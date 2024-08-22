package iotest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("test.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(1234);
		dos.writeInt(5678);
		dos.writeDouble(3.14159);
		dos.writeUTF("문자열");
		dos.close();
		
		FileInputStream fis = new FileInputStream("test.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
	} // main
} // class
