package PROGRAMS1000;

public class Abundant_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=18;
		//int sum=0;
		for(int j=1;j<100;j++) {
			int sum=0;
			for(int i=1;i<j;i++) {
				if(j%i == 0) {
					sum = sum+i;
				}
			}
			if(sum > j) {
				System.out.println(j);
			}
		}
//		if(sum > n) {
//			System.out.println("Abundant");
//		}
//		else {
//			System.out.println("Not Abundant");
//		}

	}

}
