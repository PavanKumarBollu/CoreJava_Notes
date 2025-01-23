package SearchingAndSorting;

import java.util.Scanner;

public class BinaraySearch {
	public static void main(String[] args) {
		//for the binary search the array has to sorted array 
		int [] SortedArray = {10,12,13,15,16,48,89,99,101,102,103}; 
		int start =0;
		int last = SortedArray.length-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to Search: ");
		int uInput = sc.nextInt();
		
		
		while(start <= last) {
			int mid = (start + last)/2;
			
			if(SortedArray[mid] == uInput) {
				System.out.println("Element " + uInput +  " Found At Index " + mid);
				break;
			}
			else if(uInput > SortedArray[mid]) {
				start = mid +1;
			}
			else if(uInput < SortedArray[mid]) {
				last = mid - 1;
			}
		}
		if(start > last) {
			System.out.println("Element Not Found..!");
		}
		
		
		sc.close();
	}
}
