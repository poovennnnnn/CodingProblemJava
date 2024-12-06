package pooven;

import java.util.ArrayList;
import java.util.List;

/* Problem statement
Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ 
in ascending order.

For example:
'N' = 5.
The divisors of 5 are 1, 5. 

*Solution
1. loop until nth number
2. just check if the number (i) is divisible by given number n; 
3. to check if it is divisible use modulus operator, if a % b == 0 means it is divisible 
4. then add it Array list. 
*/

public class PrintAllDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printAllDivisor(12));
		
	}

	static List<Integer> printAllDivisor(int num) {
		List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                arr.add(i);
            }
        }
		return arr;
	}
}
