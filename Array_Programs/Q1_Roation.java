package Array_Programs;

public class Q1_Roation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Array Left Roatete
		
		int n=4;
		int arr[]= {1,2,3,4,5};
		System.out.println("Before Rotation : ");
		for(int arr1: arr) {
			System.out.print(arr1+ " ");
		}
		for(int i=0;i<n;i++) {
			int m1 = arr[0];
			for(int j=0;j<arr.length;j++) {
				
				if( j == arr.length -1) {
					arr[j] = m1;
				}
				else {
					arr[j] = arr[j+1];
				}
			}
			System.out.println();
			System.out.println(i+" Iteration");
			for(int arr1: arr) {
				System.out.print(arr1+ " ");
			}
			
		}
//		System.out.println();
//		for(int arr1: arr) {
//			System.out.print(arr1+ " ");
//		}

	}

}
