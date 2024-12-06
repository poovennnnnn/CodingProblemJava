package pooven;

/*
 There are two methods to find a square root of given number n
 1. Using Math.floor() and Math.sqr() in-built function: both function do not return an int value,
  so we need to type cast them to an int value
 2. Without using in-built function: We try to find i such that i * i is equal to the given number n,
   and return the i value.
 * */

public class SquareRootOfnumber {
	public static void main(String[] args) {
		//System.out.println(squareRoot(5));
		System.out.println(squareRootWithoutMath(5));		
	}
	
	static int squareRoot(int num) {
		int sqrt = (int)Math.floor(Math.sqrt(num));		
		return sqrt;
	}
	
	static int squareRootWithoutMath(int N) {
		if (N == 0 || N == 1) {
			return N;
		}
		int i = 1;
		int result = 1;
		while (result <= N) {
			i++;
			System.out.println(i);
			result = i * i; 		
		}
		return i - 1;
	}
}
