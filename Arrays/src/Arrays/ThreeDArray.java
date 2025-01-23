package Arrays;

import java.util.*;

public class ThreeDArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		// Regular three dimensional array
//
//		int[][][] classMarks = new int[2][3][4];
//
//		// taking the input values form the user
//
//		for (int i = 0; i < classMarks.length; i++) {
//			for (int j = 0; j < classMarks[i].length; j++) {
//				for (int k = 0; k < classMarks[i][j].length; k++) {
//					System.out.println("Enter the " + i + " school " + j + " class " + k + " Student " + " Marks");
//					classMarks[i][j][k] = sc.nextInt();
//				}
//			}
//		}
//
//		// printing the marks
//
//		for (int i = 0; i < classMarks.length; i++) {
//			for (int j = 0; j < classMarks[i].length; j++) {
//				for (int k = 0; k < classMarks[i][j].length; k++) {
//					System.out.print(classMarks[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		// jagged three dimensional array

		int[][][] classMarks = new int[2][][];
		
		classMarks[0] = new int[2][3];
		classMarks[1] = new int[3][4];
		

		// taking the input values form the user

		for (int i = 0; i < classMarks.length; i++) {
			for (int j = 0; j < classMarks[i].length; j++) {
				for (int k = 0; k < classMarks[i][j].length; k++) {
					System.out.println("Enter the " + i + " school " + j + " class " + k + " Student " + " Marks");
					classMarks[i][j][k] = sc.nextInt();
				}
			}
		}

		// printing the marks

		for (int i = 0; i < classMarks.length; i++) {
			for (int j = 0; j < classMarks[i].length; j++) {
				for (int k = 0; k < classMarks[i][j].length; k++) {
					System.out.print(classMarks[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
