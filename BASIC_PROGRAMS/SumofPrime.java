package PROGRAMS1000;

public class SumofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		int n1=0;
		
		
		for(int i=2;i<=n;i++) {
			if(isprime(i) == 1) {
				if(isprime(n-i) ==1) {
					System.out.println(i + ","+(n-i));
					n1=1;
				}
			}
		}

	}

	private static int isprime(int n) {
		int c=1;
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				c = 0;
				break;
			}
		}
		return c;
	}

}
