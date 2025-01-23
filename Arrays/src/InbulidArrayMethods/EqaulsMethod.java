package InbulidArrayMethods;

import java.util.Arrays;

public class EqaulsMethod {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int [] b = {1,2,3,4,5,6,7,8,9,10};
		int [] c = {1,2,3,4,5,6,7,8,9};
		
		
		System.out.println("First Array : ");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println();
		System.out.println("Second Array");
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println("both a and b Arrays are equal : " + Arrays.equals(a, b));
		System.out.println();
		System.out.println("thard Array : ");
		System.out.println(Arrays.toString(c));
		System.out.println();
		System.out.println("both b and c Arrays are equal : " + Arrays.equals(b, c));
		
		
	}
}
