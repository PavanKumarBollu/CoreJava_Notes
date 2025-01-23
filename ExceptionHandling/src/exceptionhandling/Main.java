package exceptionhandling;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println(" in main ");
		doStuff();
		System.out.println(" existing main method ");
	}
	public static void doStuff()
	{
		System.out.println(" started doing stuff ");
		doMoreStuff();
		System.out.println(" existed doing stuff ");
	}
	
	public static void doMoreStuff()
	{
		System.out.println(" doing more stuff ");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println( " " + 10/2);
		}
		System.out.println(" existing doing more stuff ");
	}
}
