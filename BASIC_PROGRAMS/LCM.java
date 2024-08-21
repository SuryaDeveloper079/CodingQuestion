package PROGRAMS1000;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int n1=14;
		int gcd=1;//\748/8;
		
		for(int i=1;i<=n || i<=n1;i++) {
			if(n % i == 0 && n1 % i == 0) {
				gcd =  i;
			}
		}
		int lcm = (n * n1);
		System.out.println(lcm/gcd);
	
	}

}
