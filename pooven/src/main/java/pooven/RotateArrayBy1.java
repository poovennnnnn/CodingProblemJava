package pooven;

/*
 * Given an array arr, rotate the array by one position in clock-wise direction.
 * */

public class RotateArrayBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,23,23,44,55,67,77};
		rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		

	}
	
	 public static void rotate(int[] arr) {
	        // code here
	        int n = arr.length-1;
	        int lastVal = arr[n];
	        for (int i = n; i > 0; i--) {
	            arr[i] = arr[i-1];
	        }
	        arr[0] = lastVal;
	    }

}
