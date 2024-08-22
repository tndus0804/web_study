package iotest;

import java.io.FileReader;
import java.io.LineNumberReader;

public class LineNumberTest {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("애국가.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
//		System.out.println(lnr.readLine());
//		System.out.println(lnr.readLine());
		
		while(true) {
			String line = lnr.readLine();
			int lineNum = lnr.getLineNumber();
			if(line == null) break;
			System.out.println(lineNum + ": " + line);
		}
		lnr.close();
		
		

	} // main
} // class
