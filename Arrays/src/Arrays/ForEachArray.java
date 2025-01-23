package Arrays;

public class ForEachArray {
	public static void main(String[] args) {
		int [] demo = {12,25,124,214,35,14,47,55};
		int [][] two = {{1,2,3,4},{5,6,7,8}};
		
		//for each loop
//		for(int d: demo) {
//			System.out.println(d);
//		}
		
		
		for(int [] row:two ) {
			for(int value: row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
