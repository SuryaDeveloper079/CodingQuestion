package Array_Programs;

import java.util.Arrays;

public class Q4_TwoSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,2,3};
		int tar=6;
		System.out.println(Arrays.toString(TwosumArray(arr,tar)));

	}

	private static int[] TwosumArray(int[] arr, int tar) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[i+1] == tar) {
					return new int[]{i,j};
				
				}
			}
			
		}
		return new int[]{};
		
		
	}

}
