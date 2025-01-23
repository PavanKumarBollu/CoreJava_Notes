package ArrayProbleams;

public class CheckArrayContainsTheEle {
	public static void main(String[] args) {
		int[] my_array1 = {
		         1789, 2035, 1899, 1456, 2013, 
		         1458, 2458, 1254, 1472, 2365, 
		         1456, 2265, 1457, 2456, 1234
		      };
		
		System.out.println("Array contains 1234: " + contains(my_array1,1234));
		System.out.println("Array contains 5678: " + contains(my_array1, 5678));
		System.out.println(CheckArrayContainsTheEle.contains(my_array1, 2035));
	}
	
	public static boolean contains(int[] a, int ele)
	{
		for(int e : a)
		{
			if(e==ele)
			{
				return true;
			}
		}
		return false;
	}
	
	
}
