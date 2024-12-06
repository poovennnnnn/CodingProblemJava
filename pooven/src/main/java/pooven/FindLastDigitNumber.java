/**
 * 
 */
package pooven;

/**
 * @author Coding
 *
 */
public class FindLastDigitNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 199124870;
		int lastDigit = findLastDigitNumber(num);
		System.out.println("Last digit of " +num +" is "+ lastDigit);

	}
	
	static int findLastDigitNumber(int num) {
		return num%10;
	}

}
