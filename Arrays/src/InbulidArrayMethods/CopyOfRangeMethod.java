package InbulidArrayMethods;

import java.util.Arrays;

public class CopyOfRangeMethod {
	public static void main(String[] args) {
		
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		int [] b;
		
		b = Arrays.copyOfRange(a, 1, 5); // 1 is inclusive 5 is exclusive
		
		System.out.println("Orginal Array : ");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Copied Array : ");
		System.out.println(Arrays.toString(b));
	}
}
