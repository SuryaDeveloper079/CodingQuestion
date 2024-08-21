package PROGRAMS1000;

public class BinaryToOctal {

	public static void main(String[] args) {
		
		int binary=1010;
		
		int dec=0;
		int n=0;
		while(binary > 0) {
			int temp = binary %10;
			dec +=temp*Math.pow(2, n);
			binary /=10;
			n++;
		}
		int octal[]=new int[20];
		int i=0;
		while(dec > 0) {
			int r= dec%8;
			octal[i++] = r;
			dec /=8;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(octal[j]);
		}
	}

}
