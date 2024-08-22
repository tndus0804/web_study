package exception;

class NetAccess implements AutoCloseable {
	public void open() { System.out.println("접속"); }
	public void send() { System.out.println("전송"); }
	@Override
	public void close() { System.out.println("해제"); }
}

public class ExceptionTest4 {
	
	public static void main(String[] args) {
		NetAccess na = new NetAccess();
		try(na) {
			na.open();
			na.send();			
		}
			
	} // main
	
} // class
