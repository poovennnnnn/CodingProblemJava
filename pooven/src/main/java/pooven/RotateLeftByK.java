package pooven;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateLeftByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		int k = 2;
		System.out.println(rotateArray(arr, k));

	}
	
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k % n;
        int i, j;
        //if we want to rotate right, just have to change the of reversing. 
        //eg: reverse k to n-1 -> 0 to k-1 -> wholle array 
        //reverse 0 to k-1
        for (i = 0, j = k - 1; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }

        //reverse k to n-1
        for (i = k, j = n - 1; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }

        //reverse whole array
        for ( i = 0,j = n -1; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
        return arr;
    }

}
