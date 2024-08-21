package PROGRAMS1000;

public class Automorphic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.println("All Automorphic Numbers between 1 and 100:");
		        for (int num = 1; num <= 100; num++) {
		            if (isAutomorphic(num)) {
		                System.out.print(num + " ");
		            }
		        }
		        /*if(isAutomorphic(num)) {
					 System.out.println("Automorphic");
		        }
		        else {
		        	System.out.println("Not");
		        }*/
	
		
		 }

		    static boolean isAutomorphic(int n) {
		        int square = n * n;
		        while (n != 0) {
		            if (n % 10 != square % 10) {
		                return false;
		            }
		            n /= 10;
		            square /= 10;
		        }
		        return true;
		    }

	}
