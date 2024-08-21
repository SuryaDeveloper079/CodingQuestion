package PROGRAMS1000;

public class CountNoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		int cnt=0;
		while(n > 0) {
			int rem = n%10;
			cnt++;
			n /=10; }
		System.out.println("Count the Number of Digit: "+cnt);

	}

}
