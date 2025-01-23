package ArrayProbleams;

public class AverageValueOfArrayElements {
	public static void main(String[] args) {
		//calculate the average of the array elements 
		
		//avg = sum / Total elements
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		int avg = 0;
		
		for(int e : a)
		{
			sum+=e;
		}
		avg = sum/a.length;
		System.out.println("sum : " + sum);
		System.out.println("Avg : " + avg);
	}
}
