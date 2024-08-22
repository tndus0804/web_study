package thread;

public class ThreadTest3 {
	
	public static void main(String[] args) {
		CalcThread work = new CalcThread();
		work.start();
		
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		work.interrupt();
		
		
	} // main
} // class

class CalcThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("\n계산 취소");
			return;
		}
		System.out.println("\n계산 완료");
	} // run
} // CalcThread