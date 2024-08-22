package consoletest;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleTest1 {
	public static void main(String[] args) {
		int name = 0;
		System.out.println("이름을 입력한 후 enter를 눌러라 (종료: Ctrl + Z)");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		while(true) {
			try {
//				name = System.in.read();
				name = isr.read(); // 한글입력 가능
				if(name == -1) break;
				System.out.print((char)name);
			} catch(IOException e) {
				System.out.println("input error");
			}
		}
		System.out.println("입력완료");	
			
		
		
	} // main
} // class
