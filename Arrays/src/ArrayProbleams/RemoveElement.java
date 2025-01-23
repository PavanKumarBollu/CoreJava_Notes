package ArrayProbleams;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		
		//Remove the element from the array using the index value
		
		int[] myArr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		
		System.out.println("Array Before removing the element : " );
		System.out.println(Arrays.toString(myArr));
		System.out.println("Length Before removing : " + myArr.length);
		
		int index = 3; //15 will be removed
		
		for(int i = index; i < myArr.length-1; i++)
		{
			
			myArr[i] = myArr[i+1];//last element will remain same in this case
		}
		System.out.println();
		
		System.out.println("Array After Removing the element");
		
		System.out.println(Arrays.toString(myArr));
		System.out.println("Length after removing : " + myArr.length);
		
			
	}

}
