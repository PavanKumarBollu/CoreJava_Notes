package InbulidArrayMethods;

import java.util.Arrays;

public class CopyOfMethod {
	
	public static void main(String[] args) {
		
		//copy of method is used to copy the array to another array
		
		
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		//Creating own copyofMethod
		int [] result = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			result[i] = a[i];
		}
		
		System.out.println("Own copyOf Method Result of 1D array: ");
		System.out.println(Arrays.toString(result));
		
		System.out.println();
		
		
		
		
		System.out.println();
		//inbuilt copyOfMethod 1d Array
		
		int [] b = Arrays.copyOf(a,a.length);//
		System.out.println("Inbuilt copyOf Method for 1D Array : " );
		System.out.println(Arrays.toString(b));
		
		System.out.println();
		
		int [][] c = {{1,2},{3,5}};
		
		//creating Own method of copyOf 
		
		int [][] d = new int[2][2];//creating empty array for storing c array elements
		for(int y = 0; y < c.length; y++)
		{
			for(int z =0; z < c[y].length; z++)
			{
				d[y][z] = c [y][z];
			}
		}
		System.out.println("Own copyOf Method for 2d Array : ");
		for(int x = 0; x < c.length; x++)
		{
			System.out.print(Arrays.toString(d[x]) + " ");
		}
		
		
		
		System.out.println();
		
		System.out.println();
		//inbuilt copyOfMethod For 2d Array
		
		int [][] e = Arrays.copyOf(c, c.length);
		
		System.out.println("Inbuilt copyOf Method for 2d Array : ");
		for(int x = 0; x < c.length; x++)
		{
			System.out.print(Arrays.toString(e[x]) + " ");
		}
		
		
	}
}
