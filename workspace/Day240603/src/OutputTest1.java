import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest1 {
	
	public static void main(String[] args) throws Exception {
		byte[] data = {8, 9, 0, 6, 2, 9, 9};
		
		FileOutputStream out = new FileOutputStream("test.txt");
		out.write(data);
		out.close();
				
	} // main
} // class
