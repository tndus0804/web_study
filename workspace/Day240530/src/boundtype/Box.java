package boundtype;

public class Box<T extends Human> {
	T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	void intro() {
		value.intro();
	}
	
} // class
