package InbulidArrayMethods;

import java.util.*;

public class SortMethod {

	public static void main(String[] args) {
		
		//sorting method is used to sort the array elements in ascending order
		
		int [] a  = {50,49,48,47,46,45};
		System.out.println("before sorting: ");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("AfterSorting: ");
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println();
		
		char[] c = {'p','a','v','a','n'};
		
		System.out.println("before sorting: ");
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("AfterSorting: ");
		System.out.println(Arrays.toString(c));
			
	}

}
