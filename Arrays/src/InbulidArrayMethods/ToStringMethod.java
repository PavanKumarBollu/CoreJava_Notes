package InbulidArrayMethods;

import java.util.Arrays;

public class ToStringMethod {
	public static void main(String[] args) {
		
//		creating own toStringMethod
		
		int[] a = {1,3,5,7,9};
		String string = ""; //empty String to Store the array Elements;
		
		for(int f = 0; f < a.length; f++)
		{
			if(f==0)
			{
				string += "[";
				string += a[f]+", ";
			}
			else if(f==a.length-1)
			{
				string += a[f] +"";
				string+= "]";
				
			}
			else
			{
				string +=a[f] + ", ";
			}
			
		}
		System.out.println(string);
		
		
		
		
		
		//toStringMethod Will works on the 1d Array only 
		
		
		//1D Array
		int[] i = new int[4];
		i[0] = 2;
		i[1] = 3;
		i[2] = 5;
		i[3] = 7;
		
		String str = Arrays.toString(i); // this method will converts the Array to single line
		
		System.out.println(str);
		
//		2D Array
		
		int [][] j = {{1,2},{3,4}};
		
		//going into the 2d array to get the 1d data then printing the array using toStringMethod;
		
		for(int k = 0; k<j.length; k++)
		{
			String str2 = Arrays.toString(j[k]);
			System.out.print(str2 + " ");
		}
		
		
	}
}
