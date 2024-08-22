package thread;

public class ThreadTest3 {
	
	public static void main(String[] args) {
		Thread worker = new Thread(m);
		worker.start();
		
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
	
	
	static Runnable m = new Runnable() {
		@Override
		public void run() {
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
	}; // Runnable
	
} // class
