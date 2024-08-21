package PROGRAMS1000;

import java.util.Arrays;

public class DecimalToexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=2545;
		String hexa1="";
		String hexa="0123456789ABCDEF";
		while(dec >0) {
			int rem = dec % 16;
			char ch=hexa.charAt(rem);
			hexa1 += ch ;
			dec /=16;
		}
		String hexadec="";
		for(int i=hexa1.length()-1;i>=0;i--) {
			//System.out.print(hexa1.charAt(i));
			hexadec +=hexa1.charAt(i); 
		}
		System.out.println(hexadec);
		
	}

}
