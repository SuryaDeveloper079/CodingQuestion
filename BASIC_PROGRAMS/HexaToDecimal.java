package PROGRAMS1000;

public class HexaToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hexa="C9";
		int decimal=0;
		String digits="0123456789ABCDEF";
		for(int i=0;i<Hexa.length();i++) {
			char c=Hexa.charAt(i);
			int d=digits.indexOf(c);
			decimal = 16*decimal +d;
		}
		System.out.println(decimal);
	}

}
