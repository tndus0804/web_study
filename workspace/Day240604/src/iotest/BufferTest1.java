package iotest;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferTest1 {
	
	public static void main(String[] args) throws Exception {
		byte[] data = {5, 4, 1, 5, 6, 9, 8, 7, 5, 8, 7, 4, 6, 5, 9};
		FileOutputStream fos = new FileOutputStream("test.buf");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(data);
		bos.close();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.buf"));
		
		int size = bis.available();
		byte[] indata = new byte[size];
		bis.read(indata, 0, size);
		bis.close();
		
		for(byte b : indata) {
			System.out.print(b);
		}
		
		
		
	} // main
} // class
