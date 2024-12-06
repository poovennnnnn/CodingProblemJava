package pooven;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPlaindrome(343));
		System.out.println(isPlaindrome(123));
	}
	
	static String isPlaindromewithString(int num) {
		String str = String.valueOf(num);
		StringBuilder strBuilder = new StringBuilder(str);
		String reversedStr = strBuilder.reverse().toString();
		if (reversedStr.equals(str)) {
			return "YES";
		}
		return "NO";
	}
	
	static String isPlaindrome(int num) {
		long reversedDigit = 0;
		int digit = 0;
		int tempNum = num;
		while (tempNum != 0) {
			digit = (int) (tempNum % 10);
			reversedDigit = reversedDigit * 10 + digit;
			tempNum /= 10;
		}
		if (reversedDigit == num) {
			return "YES";
		}
		return "NO";
	}

}
