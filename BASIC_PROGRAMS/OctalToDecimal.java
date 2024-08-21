package PROGRAMS1000;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int octal=2001;
		int decimal=0;
		int digit=0;
		while ( octal != 0) {
			int temp = octal%10;
			decimal +=temp *Math.pow(8, digit);
			octal/=10;
			digit++;
		}
		System.out.println(decimal);
	}

}
