package exceptionhandling;

import java.util.Scanner;

public class ExceptionMultiTryCatchBlock {

	
	//if we are using the multiple try catch blocks if you handled the exception properly then one try block
	// will not effect the other try-catch blocks 
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int num1, num2, sum;
			System.out.println("enter the firstNumber: ");
			num1 = sc.nextInt();
			System.out.println("enter the second number: ");
			num2 = sc.nextInt();
			sum = num1/num2;
			System.out.println("division of " + num1 + " and " + num2 + " is " + sum);
			
		}
		catch(ArithmeticException ae)
		{
			ae.getMessage();
			System.out.println("please provide some valid denominator");
		}
		
		
		
		try
		{
			System.out.println("enter the size of an array :");
			int arrSize = sc.nextInt();
			int[] arr = new int[arrSize];
			System.out.println("new array is created with " + arrSize + " Size ");
			
			System.out.println("enter the element to store in array :");
			int ele = sc.nextInt();
			System.out.println("enter the position in which you want to stor the element:");
			int position = sc.nextInt();
			
			arr[position] = ele;
			System.out.println("element " + ele + " is inserted at " + position + " position ");
		}
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("please enter a valid position with in range ");
		}
		catch(NegativeArraySizeException nase)
		{
			System.out.println("array can't be created for negitive values kindly be positive.");
		}
		catch(Exception e)
		{
			System.out.println("wrong input please try againg...");
		}
		finally
		{
			sc.close();
			System.out.println("connection is terminated ");
		}
	}
}
