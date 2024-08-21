package Array_Programs;

public class Q2_RotateArrayRight {
	public static void main(String[] args) {
		
		int n=2;
		int arr[]= {1,2,3,4,5};
		System.out.println("Before Rotation : ");
		for(int arr1: arr) {
			System.out.print(arr1+ " ");
		}
		for(int i=0;i<n;i++) {
			int m1 = arr[arr.length-1];
			for(int j=arr.length-1;j>=0;j--) {
				
				if( j == 0) {
					arr[j] = m1;
				}
				else {
					arr[j] = arr[j-1];
				}
			}
			System.out.println();
			System.out.println(i+" Iteration");
			for(int arr1: arr) {
				System.out.print(arr1+ " ");
			}
			
		}
	}

}
