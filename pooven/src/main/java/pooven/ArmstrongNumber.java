package pooven;

/*
You are given a 3-digit number n, Find whether it is an Armstrong number or not.
An Armstrong number of three digits is a number such that the sum of the cubes of 
its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

Note: Return true if it is an Armstrong number else return false.

Solution:
1. find the last digit and power(n,3)
2. add it to a variable 

 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(armstrongNumber(153));
	}
	
	 static boolean armstrongNumber(int n) {

	        int tempNum = n;
	        int arm = 0;
	        int digit = 0;
	        while (tempNum != 0) {
	            digit = tempNum % 10; // finds the last digit of the number
	            arm += Math.pow(digit, 3);
	            tempNum /= 10; //removes the last digit of the number
	        }
	        return (n == arm);
	    }
}
