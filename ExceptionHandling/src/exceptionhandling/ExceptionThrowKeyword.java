package exceptionhandling;

import java.util.Scanner;

//basically throw keyword is used to re throw an handled exception to the caller method
//after the throw statement we can't keep any lines otherwise compile time error
//even if you mention the throw keyword in catch block first the finally block gets executes then the throw key word will throw the object to the caller method
//finally block will have the grater control over return
//System.exit(0) will have the grater control over the  finally block

class Calc
{
	public void divide()
	{
		try
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
		catch(ArithmeticException ae)
		{
			System.out.println("Exception in calc.divide method ");
			System.out.println("enter valid denominator");
			throw new ArithmeticException("invalid denominator");
		}
	}
}


public class ExceptionThrowKeyword {
	
	public static void main(String... args)
	{
		try
		{
			System.out.println("int main method");
			Calc calc = new Calc();
			calc.divide();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" exception object received in main");
			System.out.println(ae.getMessage());
		}
	}
	
}
