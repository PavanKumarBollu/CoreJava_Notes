package InbulidArrayMethods;

import java.util.Arrays;

public class BinarySearchMethod {
	public static void main(String[] args) {
		char [] c = {'p', 'a', 'v', 'a', 'n'};
		Arrays.sort(c);
		System.out.println(Arrays.binarySearch(c, 'e'));
	}
}
