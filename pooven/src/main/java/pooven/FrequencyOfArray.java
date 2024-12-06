package pooven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*You are given an array arr[] containing positive integers. 
 * The elements in the array arr[] range from 1 to n (where n is the size of the array), 
 * and some numbers may be repeated or absent. Your task is to count the frequency 
 * of all numbers in the range 1 to n and return an array of size n such that result[i] 
 * represents the frequency of the number i (1-based indexing).
 * */


public class FrequencyOfArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, 2, 3, 5};
		List<Integer> result = frequencyCount(arr);
		result.stream().forEach((x)-> System.out.print(x +", "));
	}
	
	public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }else {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
        }
        
        for (int i = 0; i < n; i ++) {
            if (map.get(i+1) != null) {
                result.add(map.get(i + 1));
            } else {
            	result.add(0);
            }
        }
        
        return result;
    }

}
