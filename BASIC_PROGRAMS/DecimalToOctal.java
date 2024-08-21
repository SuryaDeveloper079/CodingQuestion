package PROGRAMS1000;

import java.util.Arrays;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=10;
		int bin[]=new int[20];
		int i=0;
		while(dec >0) {
			int rem = dec % 8;
			bin[i++] = rem;
			dec /=8;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(bin[j]);
		}
	}

}
