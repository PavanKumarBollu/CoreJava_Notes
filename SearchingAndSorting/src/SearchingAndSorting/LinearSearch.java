package SearchingAndSorting;

import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		int [] ar = {12,15,13,44,15,164,14,45};
		
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to Search: ");
		int uInput = sc.nextInt();
		
		//searching the element in the array
		
		for(int i = 0; i < ar.length; i++) {
			if(uInput == ar[i]) {
				System.out.println("Your Key " + uInput + " Found At " + i);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Element Not Found try agin.....!");
		}
		
		sc.close();
	}
}
