package PROGRAMS1000;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		for(int i=1;i<=n;i++) {
				int sum=0,temp,len;
				
				len=getLength(i);
				temp=i;
				while(temp > 0) {
					int rem=temp%10;
					sum=sum+ (int)Math.pow(rem, len);
					temp/=10;
				}
				if(sum == i)
					System.out.println(i);
		}

	}

	private static int getLength(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i >0) {
			int rem=i%10;
			count++;
			i/=10;
		}
		
		return count;
	}

}
