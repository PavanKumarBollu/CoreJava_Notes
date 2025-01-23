package Arrays;

public class ArraysConstructions {
	public static void main(String[] args) {
		
		
		// one dimensional array construction
			int[] a ;
			
			
			a = new int[0];//we can specify the 0 as the size
			int []b;
			int c[];
			int [] d;
			d = new int [2];
//			a[0] = 2;//arrayIndexOutofBoundException
			
			
			System.out.println(d.length);
			
			/* 
			 * Tricky Questions
			 * ================
			 */
			 
			int[] x,y = new int[4];
			int []p,q;
			int f[],g[];
//			int []j, k[] = new int[5];//CE
			int u[], v;
			u = new int[4]; v =5;
//			int j, []k;//CE
//			int m[], []n;//CE

			
			
			
			
			
			
			
//			two dimensional Array declarations
			
			int[][] A;
			int  [][]B;
			int[]  []C;
			int[] D[];
			int  []E[];
			int F[][];
			
			A = new int[3][3];
			B = new int[3][3];
			C = new int[3][3];
			D = new int[3][3];
			E = new int[3][3];
			F = new int[3][3];
			
			/*
			 * Tricky Questions
			 * ================
			 */
			
			int[][] G,H = new int [3][2];
			System.out.println(H[1].length);
			
			int[] []I, J  = new int[3][2];
			System.out.println("j length : " + J.length);
			
//			int[] K[], L = new int[3][];// K is 2d and L is 1D Array
			
			
//			2D Array Construction
			
			int[][] M = new int [3][3];	//Regular Array	
					
//					OR
					
			int[][] N = new int [3][];  //Jagged Array
			N[0] = new int[2];
			N[1] = new int[3];
			N[2] = new int[4];
			
			//shortcut Way to 2d Array
			
			int[][] O = { {1,2}, {3,4}, {5,6} };//Regular Array of size 2 x 2
			
			int[][] P = {{1,2},{3,4,5}, {6,7,8,9}}; // Jagged Array 
			
	}
}
