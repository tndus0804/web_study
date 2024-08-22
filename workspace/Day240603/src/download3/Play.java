package download3;

public class Play extends Thread {
	Memory mem;
	
	public Play(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		synchronized (mem) {
			try {
				mem.wait();
			} catch (InterruptedException e) { }
		}
		
		for(int off = 0; off < mem.progress; off++) {
			System.out.print(mem.buffer[off] + " ");
		}
		System.out.println();
		
	} // run
	
	
} // class
