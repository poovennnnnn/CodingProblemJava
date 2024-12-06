package pooven;

/*
 * this may not be the optimum solution 
 * */

public class FindMissiingRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5,6,7,8,8};
		int[] result = findMissiingRepeatingNumber(arr);
		System.out.println("repeating number: "+result[0] + ", missing : "+result[1]);

	}
	
	public static int[] findMissiingRepeatingNumber (int[] arr) {
		int n = arr.length;
        int[] arr1 = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr1[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        for (int i=1; i<=n; i++){
            if(arr1[i]== 2) {
                repeating = i;
            }else if (arr1[i] == 0){
                missing = i;
            }

            if(missing != -1 && repeating != -1){
                break;
            }
        }
        int[] result = {repeating, missing};
        return result;
	}
}
