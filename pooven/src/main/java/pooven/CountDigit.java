package pooven;

//Given a positive integer n, count the number of digits in n that divide n evenly
//(i.e., without leaving a remainder). Return the total number of such digits

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Math.abs(123.8));
		//int num = 3/2;
		//System.out.println(num);
		int num = 12;
		System.out.println(countDigit(num));

	}
	
	static int countDigit(int num) {
		int count = 0;
		int digit = 0;
		int tempnum = num;
		
		if (num == 0) {
		return 1;
		}
		
		while (tempnum != 0) {
			digit = tempnum % 10; //last digit of the number
			System.out.println("Digit :" + digit);
			tempnum =  tempnum/10; // removes last digit
			System.out.println("tempnum :" +tempnum);
			if (digit != 0 && num % digit == 0) {
				count++;
			}
		}
		
		return count;
	}
}
