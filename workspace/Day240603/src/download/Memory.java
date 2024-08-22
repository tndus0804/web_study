package download;

public class Memory {
	int[] buffer;
	int size;
	int progress;
	
	public Memory(int size) {
		this.size = size;
		buffer = new int[size];
		progress = 0;
	}
	
} // class
