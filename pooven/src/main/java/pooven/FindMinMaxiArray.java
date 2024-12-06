package pooven;

import java.util.ArrayList;
import java.util.List;

public class FindMinMaxiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 0, 56, 100001, 167};
		System.out.println(getMinMax(arr));
		
	}
	
	static List<Long> getMinMax(int[] arr) {
		 long min = arr[0];
	     long max = 0;
	     List<Long> result = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (min > arr [i]) {
	                min = arr[i];
	            }
	        }
	        result.add(min);
	        result.add(max);
	        return result;
	        // int n = arr.length;
	        // Arrays.sort(arr);
	        // return new Pair(arr[0], arr[n-1]);
	}

}
