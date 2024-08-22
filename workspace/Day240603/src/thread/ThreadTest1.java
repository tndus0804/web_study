package thread;

public class ThreadTest1 {
	
	public static void main(String[] args) {
		PrintThread1 work1 = new PrintThread1();
		PrintThread2 work2 = new PrintThread2();
		work1.start();
		work2.setPriority(Thread.MAX_PRIORITY); // 10에 가까울 수록 중요함
		work2.start();
		
		
		
		
	} // main
} // class

class PrintThread1 extends Thread {
	@Override
	public void run() {
		double sum = 0;
		for(int i = 0; i < 10000000; i++) {
			sum += Math.cos(i); // 코싸인 함수
		}
		System.out.println("cos = " + sum);
		
	}
}

class PrintThread2 extends Thread {
	@Override
	public void run() {
		double sum = 0;
		for(int i = 0; i < 10000000; i++) {
			sum += Math.sin(i); // 싸인함수
		}
		System.out.println("sin = " + sum);
		
	}
}
