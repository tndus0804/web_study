package thread;

public class ThreadTest2 {
	
	public static void main(String[] args) {
		PrintThread work = new PrintThread();
		work.setDaemon(true);
		work.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		
		
	} // main
} // class

class PrintThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("save");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}


