package download;

public class Play extends Thread {
	Memory mem;
	
	public Play(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		for(;;) { // 무한루프
			synchronized(mem) {
				for(int off = 0; off < mem.progress; off++) {
					System.out.print(mem.buffer[off] + " ");
				}
				System.out.println();
			}
						
			if(mem.progress == mem.size) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
	
	
	
	
} // class
