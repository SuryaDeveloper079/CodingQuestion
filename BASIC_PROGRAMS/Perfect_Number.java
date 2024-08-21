package PROGRAMS1000;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28, sum = 0;

	     for (int i = 1; i <= n; i++)
	       {
	     	if (PerfectNumber(i) == true)
	     		System.out.println (i + " Is a perfect number");
//	     	else
//	     		System.out.println (i + " Is not a perfect number");
	       }
	}

	public static boolean PerfectNumber(int n) {
		int sum =0;
		for(int i=1;i<n;i++) {
			if(n%i == 0) {
				sum = sum+i;
			}
		}
		if(sum == n) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
