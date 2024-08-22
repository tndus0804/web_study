package generic;

public class Box<T> {
	T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	T get() {
		return this.value;
	}
	
	void set(T value) {
		this.value = value;
	}
} // Box
