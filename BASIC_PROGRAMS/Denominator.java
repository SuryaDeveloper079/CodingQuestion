package PROGRAMS1000;

public class Denominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=1,den1=3,num2=3,den2=9;
		int num,den,x;
		
		if(den1 == den2) {
			num =num1+num2;
			den = den1;
		}
		else {
			num=(num1*den2)+(num2*den1);
			den = den1*den2;
		}
		if(num > den)
			x = num;
		else
			x = den;
		for(int i=1;i<=x;i++) {
			if(num%i == 0 && den%i == 0) {
				num = num/i;
				den = den/i;
			}
		}
		
		int n = 1;
		int p = num;
		int q = den;
		if( num != den)
		{
			while(n != 0)
			{
				n = num % den;			
				if(n != 0)
				{
					num = den;
					den = n;
				}
			}			
		}
		System.out.println("("+p/den+" / "+q/den+")");

	}

}
