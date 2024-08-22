package exception;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		int result = 0;
		try {
			result = calcSum(-100);
			System.out.println(result);
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	} // main
	
	static int calcSum(int num) throws NegativeException {
		if(num <= 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for(int i = 1; i<= num; i++) {
			sum += i;
		}
		return sum;
	}
	
} // class
