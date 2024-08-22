package interfacetest;

import java.util.logging.Logger;

public class Test1 {
	
	public static void main(String[] args) {
		HandPhoneCamera phone = new HandPhoneCamera();
		phone.call();
		phone.receive();
		phone.takePicture();
		// 책 361p
		// 책 363p 인터페이스 확장
		phone.intro();

		
		Logger log = Logger.getLogger("Test1");
		log.info("start");
		log.warning("경고!!!");
	}
	
}
