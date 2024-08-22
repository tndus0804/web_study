package objecttest;

public class CloneTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] arr2 = arr.clone();
		
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		
		arr2[0] = 100;
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		
		
		
		
	} // main
} // class
