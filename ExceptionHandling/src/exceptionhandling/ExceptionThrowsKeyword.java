package exceptionhandling;

import java.util.Scanner;


// basically throws keyword is used to throws an exception to the caller method without handling the code in the method
// throws keyword is belongs to the method signature

class Demo
{
	public void dis() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("connection is established ");
		System.out.println("enter the first number");
		int num1 =sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		int sum = num1 / num2;
		System.out.println("result of the " + num1 + "/" + num2 + " is " + sum);
		System.out.println("connection is terminated");
	}
}

class TestDemo 
{
	public void disp() throws ArithmeticException
	{
		//case 1: handled the exception in the class
		try
		{
			Demo d = new Demo();
			d.dis();
		}
		catch(ArithmeticException ae) {
			System.out.println("Enter some valid denominator ");
		}
		//case:2 ducking the exception to the caller method so that they will handle it
		Demo d = new Demo();
		d.dis();
		
	}
}


public class ExceptionThrowsKeyword {
	 public static void main(String[] args) {
		
		 try
		 {
			 TestDemo td = new TestDemo();
			 td.disp();
		 }
		 catch(ArithmeticException ae) {
			 System.out.println("finally handled the airthmetic exception in main method");
		 }
		 
		 
		 
	 }
}
