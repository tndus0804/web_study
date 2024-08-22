package filetest;

import java.io.File;
import java.io.FileWriter;

public class FileTest2 {
	public static void main(String[] args) throws Exception {
		File folder = new File("c:\\test");
//		System.out.println(folder.mkdir());
		
		File file = new File("c:\\test\\myfile.txt");
		if(file.createNewFile()) {
			FileWriter out = new FileWriter(file);
			out.write("아무거나");
			out.close();
		}
		
		
		
		
		
	} // main
} // class
