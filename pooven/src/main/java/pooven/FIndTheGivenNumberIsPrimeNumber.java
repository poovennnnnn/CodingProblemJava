package pooven;

/*For a given number n check if it is prime or not.
 * A prime number is a number which is only divisible by 1 and itself.
 * 
 * solution
 * 1. We don't have iterate through all the number is divisible or not
 * 2. we just have to iterate until i <= squareroot(N) which is equal to i * i <= N
 * */

public class FIndTheGivenNumberIsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(5));
		System.out.println(isPrime(25));

	}
	
	 static int isPrime(int N){
	        // code here
		 if(N <= 1) {
			 return 0;
		 }
		 for (int i = 2; i * i <= N; i++) {
			 if (N % i == 0) {
				 return 0;
			 }
		 }
		 return 1;
	    }
}
