package SearchingAndSorting;

public class BubbleSorting {
	public static void main(String[] args) {
		
		//arrays of values
		int[] ar = {10,14,1,21,4,2,5,78,16,32,78,98,9};
		
		int size = ar.length;
		int temp = 0;
		
		System.out.println("Before Sorting: ");
		for(int e:ar) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for(int i =0; i < size; i++) {
			for(int j =0; j < size -i -1; j++) {
				if(ar[j]>ar[j+1]) {
					temp = ar[j];//storing the j th location value in temp
					ar[j] = ar[j+1]; //taking the j+1 index value and storing it in the ae[j]
					ar[j+1] = temp;//replacing the j+1 value with temp value
				}
			}
		}
		
		
		
		
		
		System.out.println("After Sorting: ");
		for(int e : ar) {
			System.out.print(e + " ");
		}
	}
}
