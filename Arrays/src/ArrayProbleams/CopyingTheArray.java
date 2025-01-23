package ArrayProbleams;

import java.util.Arrays;

public class CopyingTheArray {
	public static void main(String[] args) {
		int[] myArr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] result = new int[myArr.length];
		
		copyArr(myArr,result);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] copyArr(int[] arr, int[] res)
	{
		int i = 0;
		for(int e:arr)
		{
			res[i++] = e;
		}
		return res;
	}
}
