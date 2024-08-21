package PROGRAMS1000;

public class PrimeNoRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isprime(int n) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
