package exceptionhandling;

import java.util.Scanner;



public class ExceptionExample1 {

	
	public static void main(String[] args) {
		int n1, n2, t;
		System.out.println("connection to calc is established");
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			n1 = sc.nextInt();
			System.out.println("enter the second Number : ");
			n2 = sc.nextInt();
			t = n1/n2;
			System.out.println("division of the num1 and num2 variables is : " + t);
		}
		catch(Exception e)
		{
			System.out.println("trying to divide the number with zero ");
		}
		System.out.println("connection to calc is terminated");
	}
	
	
	
}
