package pooven;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOfNumber(5, 10));
	}
	
	static long powerOfNumber(int N, int R) {
		long power = 1;
		for (int i = 1; i <= R; i++) {
			power *= N ;
		}
		return power;
	}

}
