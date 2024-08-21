package PROGRAMS1000;

public class BInaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary=1101;
		int base=2;
		int decimal=0;
		int digit=0;
		while ( binary != 0) {
			int temp = binary%10;
			decimal +=temp *Math.pow(base, digit);
			binary/=10;
			digit++;
		}
		System.out.println(decimal);
	}

}
