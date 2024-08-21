package PROGRAMS1000;

public class Replace_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 706120678;
		String str=Integer.toString(num);
		int len=str.length();
		String str1="";
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if( ch == '0') {
				str1 +='1';
			}
			else {
				str1 += ch;
			}
			
		}
		System.out.println(str1);
	}

}
