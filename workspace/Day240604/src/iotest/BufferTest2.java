package iotest;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferTest2 {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("애국가.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		char[] text = new char[100];
//		int num = fr.read(text);
//		System.out.println("읽은 문자 개수: " + num);
//		System.out.println(text);
//		fr.close();
		
		char[] text = new char[100];
		int num = br.read(text);
		System.out.println("읽은 문자 개수: " + num);
		System.out.println(text);
		br.close();
		
		
		
		
	} // main
} // class
