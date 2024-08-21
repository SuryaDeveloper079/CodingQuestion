package PROGRAMS1000;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=36,num1=60;
		int gcd=1;
		for(int i=1;i<=num || i<=num1;i++) {
			if(num % i == 0 && num1 % i ==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		

	}

}
