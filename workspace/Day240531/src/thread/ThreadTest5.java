package thread;

public class ThreadTest5 {
	
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		
		for(int num = 0; num < 30; num++) {
			System.out.print("O");
			try {
				Thread.sleep(200);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
//			if(num == 5) pt.suspend(); // suspend는 일시정지
			if(num == 5) pt.stop(); // stop을 하면 중지
			if(num == 25) pt.resume();
		}
		
	} // main
	
} // class
	
	
