package thread;

public class ThreadTest2 {
	
	public static void main(String[] args) {
		PrintRunnable pr = new PrintRunnable();
		Thread th = new Thread(pr);
		th.start();
		 
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
	
class PrintClass{
	public void PrintChar() {
		for(int num = 0; num < 30; num++) {
			System.out.print("X");
//			System.out.printf("%02d X\n", num);
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
	
class PrintRunnable extends PrintClass implements Runnable {
	@Override
	public void run() {
		PrintChar();
	}
}
	
	
	
