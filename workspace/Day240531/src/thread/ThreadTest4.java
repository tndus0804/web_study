package thread;

import java.awt.Toolkit;

public class ThreadTest4 {
	
	public static void main(String[] args) {
		PrintThreadChar ptc1 = new PrintThreadChar('T');
		ptc1.start();
		System.out.println(ptc1.getState());
		
		PrintThreadChar ptc2 = new PrintThreadChar('.');
		ptc2.start();
		BeetThread bt = new BeetThread(5, 1000);
		bt.start();
		
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

class PrintThreadChar extends Thread {
	char ch;
	
	public PrintThreadChar(char ch) {
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int num = 0; num < 30; num++) {
			System.out.print(ch);
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
} // class PrintThreadChar 

class BeetThread extends Thread {
	int count;
	int gap;
	Toolkit tool = Toolkit.getDefaultToolkit();
	
	
	public BeetThread(int count, int gap) {
		this.count = count;
		this.gap = gap;
	}
	
	@Override
	public void run() {
		for(int num = 0; num < count; num++) {
			tool.beep();
			try {
				Thread.sleep(gap);
			} catch (InterruptedException e) {}
		}
		
		
	}
	

}







