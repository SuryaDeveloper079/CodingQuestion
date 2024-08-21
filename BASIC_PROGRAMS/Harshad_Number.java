package PROGRAMS1000;

public class Harshad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=345;
		//int sum =0,ans=0;
			//int temp=num;
		for(int n=1;n<=20;n++) {
			int temp = n;
			int sum=0;
		while(temp !=  0) {
			int rem=temp%10;
			sum = sum+rem;
			temp/=10;
		}
		 //ans=temp / sum;
		if(n%sum == 0) {
			System.out.println(n);
		}
		}
//		if((ans * sum) == temp) {
//			System.out.println("Harshad Numebr");
//		}
//		else {
//			System.out.println("Not Harshad Number");
//		}

	}

}
