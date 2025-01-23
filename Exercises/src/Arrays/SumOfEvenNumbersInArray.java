package Arrays;

public class SumOfEvenNumbersInArray {

	public static int SumOfEvenNumbers(int[] numbers)
	{
		int sum = 0;
		for(int n : numbers)
		{
			if(n%2==0)
			{
				sum+=n;
			}
		}
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		int[] num = {68,79,86,99,23,2,41,100};
		System.out.println(SumOfEvenNumbers(num));
	}

}
