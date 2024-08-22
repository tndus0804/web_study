package download;

public class DownLoad extends Thread {
	Memory mem;
	
	public DownLoad(Memory mem) {
		this.mem = mem;
	}
	
	@Override
	public void run() {
		for(int off = 0; off < mem.size; off += 2) {
			synchronized(mem) {
				for(int chunk = 0; chunk < 2; chunk++) {
					mem.buffer[off+chunk] = off+chunk;
					mem.progress = off + chunk + 1;
					try {
						Thread.sleep(200);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			} // synchronized
		}//for
		
	} // run
} // class
