package exception;

public class NegativeException extends Exception {
	
	public NegativeException() {
		super("음수는 안됩니다.");
	}
}
