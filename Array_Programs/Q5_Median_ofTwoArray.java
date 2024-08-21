package Array_Programs;

import java.util.Arrays;

public class Q5_Median_ofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2};
		int nums2[]= {3};
		
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		 int i=0,j=0,k=0;
		 double median;
		 int m=nums1.length,
		     n=nums2.length;
		 int merged[] = new int[m+n];
		 
		 while(i<m) {
			 merged[k] = nums1[i];
			 i++;
			 k++;
		 }
		 while(j<n) {
			 merged[k]=nums2[j];
			 j++;
			 k++;
		 }
		 
		 Arrays.sort(merged);
		 
		 int len=merged.length;
		 if(len % 2 == 1) {
			 median = (len +1)/2;
		 }
		 else {
			 int n1 = merged[(len/2)-1];
			 int n2 = merged[len /2];
			 median = ((double)n1+(double)n2)/2.0;
		 }
		 
		 return median;
	        
	    }
}
