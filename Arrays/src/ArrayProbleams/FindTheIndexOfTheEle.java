package ArrayProbleams;

public class FindTheIndexOfTheEle {
	public static void main(String[] args) {
		int[] myArr = {
		         1789, 2035, 1899, 1456, 2013, 
		         1458, 2458, 1254, 1472, 2365, 
		         1456, 2265, 1457, 2456, 1234
		      };
		
		System.out.println("Index positon of the 1234 :" + findIndex(myArr, 1234));
		System.out.println("index position of the 12 : " + findIndex(myArr, 12));
	}
	
	public static int findIndex(int[] arr, int ele)
	{
		
		for(int i =0; i< arr.length; i++)
		{
			if(arr[i]== ele)
			{
				return i;
			}
		}
		return -1;
	}
}
