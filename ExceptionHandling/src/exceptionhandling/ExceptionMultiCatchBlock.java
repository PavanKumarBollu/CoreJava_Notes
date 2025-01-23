package exceptionhandling;

import java.util.Scanner;

public class ExceptionMultiCatchBlock {
	public static void main(String... arg)
	{
		int n1, n2, t;
		Scanner sc = new Scanner(System.in);
		try
		{
			
			System.out.println("Enter the first number : ");
			n1 = sc.nextInt();
			System.out.println("enter the second Number : ");
			n2 = sc.nextInt();
			t = n1/n2;
			System.out.println("division of the num1 and num2 variables is : " + t);
			
			
			
			System.out.println("Enter the size of an array");
			
			int arrSize = sc.nextInt();
			int[] arr = new int[arrSize];
			
			System.out.println("Enter the element to insert in array");
			int arrEle = sc.nextInt();
			
			System.out.println("enter the position where the element has to insert ");
			int position = sc.nextInt();
			
			arr[position] = arrEle;
			
			System.out.println("element " + arrEle + " Inserted At Posiotion " + position + " Sucessfully") ;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Trying to divide the values with zero please provide some valid denominator ");
		}
		catch(NegativeArraySizeException nase)
		{
			System.out.println("Please provide some positive size for the array");
		}
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("Be in limits");
		}
		catch(Exception e)//if you enter any other input other than int it will come here
		{
			System.out.println("wrong input please try again.......");
		}
		finally {
			sc.close();
			System.out.println("Connection terminated");
		}
		
	}
}
