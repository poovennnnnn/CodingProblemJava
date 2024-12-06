package pooven;
/*
To find the sum of the two largest numbers in an array in Java without using the 
java.util package, you can iterate through the array while keeping track
 of the two largest numbers.
*/

public class FindSumOfTwoLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {5, 1, 8, 10, 7, 20, 16, 35, 12, 50, 60, 30};
		System.out.println(findSumOfTwoLargestNumberInArray(arr));
	}
	
	static int findSumOfTwoLargestNumberInArray(int arr[]) {
		Integer largestNumber = 0;
		Integer secondLargestNumber = 0;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] > largestNumber) {  
				secondLargestNumber = largestNumber;
				largestNumber = arr[i];
			} else if (arr[i] > secondLargestNumber) {
				secondLargestNumber = arr[i];
			}
		}
		return largestNumber + secondLargestNumber;
	}
}
