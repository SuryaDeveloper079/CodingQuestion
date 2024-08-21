package PROGRAMS1000;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int r=9;
		int p=0,fact=1;
		while(n > 0) {
			fact = fact * n;
			n--;
		}
		int m=n-r,fact1=1;
		while(m > 0) {
			fact1 *= m;
			m--;
		}
		p = fact /fact1;
		System.out.println(p);

	}

}
