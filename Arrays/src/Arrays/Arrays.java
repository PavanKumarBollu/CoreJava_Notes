package Arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] ar = new int[5];
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println("Enter the student marks");
			ar[i] = sc.nextInt();
			
		}
		
		//printing the Array
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println("student " + i + " marks " + ar[i]);
		}
	}
}
