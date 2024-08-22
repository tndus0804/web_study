package filetest;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args) {
		File f = new File("c:\\workspace\\Day240604\\애국가.txt");
		//C:\workspace\Day240604\애국가.txt
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("파일입니다.");
				System.out.println("파일경로: " + f.getParent());
//				var aaa = (f.getName()).split(".").length;
				System.out.println("파일이름: " + f.getName());
				System.out.println("파일크기: " + f.length());
				System.out.println("숨김파일: " + f.isHidden());
				System.out.println("절대경로: " + f.isAbsolute());
				
				
			}
			else if(f.isDirectory()) {
				System.out.println("디렉토리입니다.");
			}
		} else {
			System.out.println("파일이 없습니다.");
		}
		
		
	} // main
} // class
