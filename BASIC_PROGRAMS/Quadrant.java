package PROGRAMS1000;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1,y=-33;
		
		if(x > 0 && y >0) {
			System.out.println("Quardent I");
		}
		else if(x <0 && y > 0) {
			System.out.println("Quardent II");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Quardent III");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Quardent IV");
		}
	}

}
