package download3;

public class Test {
	
	public static void main(String[] args) {
		Memory mem = new Memory(20);
		
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		down.start();
		play.start();
		
		
		try {
			down.join();
			play.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("다운로드 완료! 전송시작!");
		
	} // main
		
} // class
