package iotest;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderTest2 {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("애국가-ANSI.txt");
		InputStreamReader isr = new InputStreamReader(fis, "euc-kr");
		
		
		//한꺼번에
		char[] text = new char[100];
		int num = isr.read(text);
		System.out.println("읽은 문자 개수: " + num);
		System.out.println(text);
		isr.close();
		
	} // main
	
} // class
