package pooven;

/*
 Given an array, arr of positive integers.
 Find the third largest element in it. Return -1 if the third largest element is not found.
*/

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int[] arr = {3151, 9698, 3877, 7385};
		System.out.println(thirdLargest(arr));
	}

   static int thirdLargest(int arr[]) {
        if (arr.length <= 2){
            return -1;
        }
        int largestNumber = 0;
		int secondLargestNumber = 0;
		int thirdLargestNumber = 0;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] > largestNumber) {  
			    thirdLargestNumber = secondLargestNumber;
				secondLargestNumber = largestNumber;
				largestNumber = arr[i];
			} else if (arr[i] > secondLargestNumber) {
			    thirdLargestNumber = secondLargestNumber;
				secondLargestNumber = arr[i];
			}else if (arr[i] > thirdLargestNumber) {
			    thirdLargestNumber = arr[i];
			}
		}
		return thirdLargestNumber;
        // Arrays.sort(arr);
        // return arr[arr.length-3];
    }
}
