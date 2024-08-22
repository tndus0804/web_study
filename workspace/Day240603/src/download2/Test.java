package download2;

public class Test {
	
	public static void main(String[] args) {
		Memory mem = new Memory(20);
		
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		down.start();
		play.start();
		
		
		
		
		
	} // main
		
} // class
