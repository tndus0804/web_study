
public class Test {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println("");
        }
		
	}
	
	public static void getNum(int max, int num) {
		int[] arr = new int[num];
		java.util.Random random = new java.util.Random();
		for(int i = 0; i<num; i++ ) {
			int temp = random.nextInt(max)+1;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == temp) {
					i--;
					break;
				}
			}
			arr[i] = temp;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
			
		


}
