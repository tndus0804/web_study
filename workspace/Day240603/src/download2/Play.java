package download2;

public class Play extends Thread {
	Memory mem;
	
	public Play(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		for(;;) { // 무한루프
			mem.playDowned();
						
			if(mem.progress == mem.size) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
	
	
	
	
} // class
