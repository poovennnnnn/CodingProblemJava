package pooven;

public class ReverseDigits {
	public static void main(String[] args) {
		long num = 10080;
		
		System.out.println("Reversed digit : " + reverseDigits(num));
		
	}
	
	static long reverseDigits(long num) {
		long reversedDigit = 0;
		int digit = 0;
		while (num != 0) {
			digit = (int) (num % 10);
			if (digit != 0) {
			reversedDigit = reversedDigit * 10 + digit;
			}
			num /= 10;
		}
		return reversedDigit;
	}

}
