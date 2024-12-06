package pooven;
/*
Given a number N, check if a number is perfect or not.
A number is said to be perfect if sum of all its factors excluding the number 
itself is equal to the number. Return 1 if the number is Perfect otherwise return 0.
 
*/
public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(234));
	}
	
    static int isPerfectNumber(long N) {
        // code here
        if (N <= 1) {
            return 0; // 1 is not considered a perfect number
        }

        long sum = 1; // 1 is a divisor for all numbers greater than 1
        long sqrtN = (long) Math.sqrt(N);

        for (int i = 2; i <= sqrtN; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {  // Add the corresponding divisor N / i if it's different from i
                    sum += N / i;
                }
            }
        }
        return sum == N ? 1 : 0;
    }
}
