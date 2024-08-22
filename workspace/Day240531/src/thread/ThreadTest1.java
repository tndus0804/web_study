package thread;

public class ThreadTest1 {
	
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		
		for(int num = 0; num < 30; num++) {
			System.out.print("O");
//			System.out.printf("%02d O\n", num);
			try {
				Thread.sleep(200);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	} // main
} // class
	
	
class PrintThread extends Thread {
	@Override
	public void run() {
		for(int num = 0; num < 30; num++) {
			System.out.print("X");
//			System.out.printf("%02d X\n", num);
			try {
				Thread.sleep(200);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
	
	
	
