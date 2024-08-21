package PROGRAMS1000;

public class Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int sum=0;
		
		for(int i=2;i< n ;i++) {
			if(PerfectSquare(i)) {
				System.out.println(i);
			}
		}
//		if(sum*sum == n) {
//			System.out.println("Is a Perfect Square");
//		}
//		else {
//			System.out.println("Is a Not Perfect Square");
//		}
	}
	public static boolean PerfectSquare(int n) {
		int sum=0;
		
		//for(int i=2;i< n ;i++) {
			//if(n% i == 0) {
				sum = (int) Math.sqrt(n);
			//}
		//}
		if((sum*sum) == n) {
			return true;
		}
			return false;
	}

}
