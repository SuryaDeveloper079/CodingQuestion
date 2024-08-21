package PROGRAMS1000;

public class CounttheNoDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int month =3;
		int year = 2012;
		
		if((month == 2) && ((year %4 == 0) || ((year %100 != 0) && (year %400 == 0)))) {
			System.out.println("It is Leap Year 28 days");
		}
		else if(month == 2) {
			System.out.println("In this month is 29 days");
		}
		else if( month ==1 || month == 3 || month == 5 || month == 7||month == 8||month ==10 || month ==12) {
			System.out.println("In this month is 31 days");
		}
		else {
			System.out.println("In this month is 30 days");
		}

	}

}
