package implementation;

public class KadanesImp {
	
	public static int maxSum(int[] arr) {
		
		int globmax = Integer.MIN_VALUE;
		int localmax = 0;
		int[] startIndex = new int[2];
		for(int a = 0; a < arr.length; a++) {
			localmax += arr[a];
			
			localmax = Integer.max(localmax, 0);
			if(localmax == 0) {
				startIndex[0] = a+1;
			}
			globmax = Integer.max(localmax, globmax);
			if(localmax == globmax && arr[a] != 0) {
				startIndex[1] = a;
			}
		}
		for(int i = startIndex[0]; i <= startIndex[1]; i++) {
			System.out.print(arr[i]+" ");
		}
		
		return globmax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Sum ="+ " "+ maxSum(arr));
		
		int[] arr2 = {8, -7, -3, 5, 6, -2, 3, -4, 2};
		System.out.println("Sum ="+ " "+ maxSum(arr2));
	}

}
