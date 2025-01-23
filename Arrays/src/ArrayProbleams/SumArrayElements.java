package ArrayProbleams;

public class SumArrayElements {
	public static void main(String[] args) {
		
		//to sum the values of the array
		
		int sum = 0;
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		// regular for loop
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		//for each loop 
//		for(int e : a)
//		{
//			sum += e;
//		}
		
		//print the sum value
		
		System.out.println("sum of the array elements: " + sum);
	}
}
