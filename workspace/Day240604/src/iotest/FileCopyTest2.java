package iotest;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest2 {
	
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println("복사 시작");
		
		FileInputStream fis = new FileInputStream("test.buf");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("testcopy.buf");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data = 0;
		while(true) {
			data = bis.read();
			if(data == -1) break;
			bos.write(data);
		}
		bis.close();
		bos.close();
		
		System.out.println("복사 완료");
		System.out.println((System.currentTimeMillis() - start) / 1000.0 + "초 걸림");
		
	} // main
} // class
