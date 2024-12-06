package pooven;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,0,1,2,0,1,0,1};
		sort012(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
	}
	
	public static void sort012(int[] arr) {
        // code here
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 0) {
        //         count0++;
        //     }else if (arr[i] == 1){
        //         count1++;
        //     }else if (arr[i] == 2){
        //         count2++;
        //     }
        // }
        
        // int index = 0;
        // for (int i = 0; i < count0; i++) {
        //     arr[index] = 0;
        //     index++;
        // }
        // for (int i = 0; i < count1; i++) {
        //     arr[index] = 1;
        //     index++;
        // }
        // for (int i = 0; i < count2; i++) {
        //     arr[index] = 2;
        //     index++;
        // }
        
        //Dutch National Flag Algorithm
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }else if (arr[mid] == 1) {
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    
    public static void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
