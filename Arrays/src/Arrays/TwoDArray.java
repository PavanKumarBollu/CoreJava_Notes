package Arrays;

import java.util.*;

public class TwoDArray {
	public static void main(String[] args) {

		// scanner for the user input
		Scanner sc = new Scanner(System.in);

//		// Regular two dimensional array
//
//		int[][] classMarks = new int[2][3];
//
//		// taking the input values form the user
//
//		for (int i = 0; i < classMarks.length; i++) {
//			for (int j = 0; j < classMarks[i].length; j++) {
//				System.out.println("Enter the class " + i + " Student " + j + " Marks");
//				classMarks[i][j] = sc.nextInt();
//			}
//		}
//
//		// printing the marks
//
//		for (int i = 0; i < classMarks.length; i++) {
//			for (int j = 0; j < classMarks[i].length; j++) {
//				System.out.print(classMarks[i][j] + " ");
//			}
//			System.out.println();
//		}

		
		
		
		// Jagged two dimensional array

		int[][] classMarks = new int[2][];
		
		
		//defining the total students manually to very the classes totals students
		classMarks[0] = new int[4];
		classMarks[1] = new int[2];

		// taking the input values form the user

		for (int i = 0; i < classMarks.length; i++) {
			for (int j = 0; j < classMarks[i].length; j++) {
				System.out.println("Enter the class " + i + " Student " + j + " Marks");
				classMarks[i][j] = sc.nextInt();
			}
		}

		// printing the marks

		for (int i = 0; i < classMarks.length; i++) {
			for (int j = 0; j < classMarks[i].length; j++) {
				System.out.print(classMarks[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
