package iotest;

import java.io.FileReader;

public class FileReaderTest1 {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("test.txt");
		int ch = 0;
		// 1글자씩
		while(true) {
			ch = fr.read();
			if(ch == -1) break;
			System.out.print((char) ch);
		}
		fr.close();
		System.out.println();
		
		//한꺼번에
		fr = new FileReader("test.txt");
		char[] text = new char[100];
		int num = fr.read(text);
		System.out.println("읽은 문자 개수: " + num);
		System.out.println(text);
		fr.close();
		
	} // main
	
} // class
