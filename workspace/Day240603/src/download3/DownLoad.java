package download3;

public class DownLoad extends Thread {
	Memory mem;
	
	public DownLoad(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		for(int off = 0; off < mem.size; off += 2) {
			mem.downChunk(off);
		}//for
		
		
		synchronized (mem) {
			mem.notify();
		}
		
		
	} // run
} // class
