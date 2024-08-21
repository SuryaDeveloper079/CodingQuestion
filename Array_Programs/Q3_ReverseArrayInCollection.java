package Array_Programs;

import java.util.ArrayList;
import java.util.List;

public class Q3_ReverseArrayInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		System.out.println(reverseArray(arr));
		System.out.println(arr.indexOf(3));
		System.out.println(arr.size());
		
	}
	public static List<Integer> reverseArray(List<Integer> a) {
	    // Write your code here
	    List<Integer> array = new ArrayList<Integer>();
	    int i=a.size();
	  while(!a.isEmpty()) {
		  i--;
		  array.add(a.remove(i));
	  }
	    
	    return array;
}
}
