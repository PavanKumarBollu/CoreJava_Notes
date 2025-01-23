package exceptionhandling;

//System.exit(0) > finally block

// System.exit(0) will shuts down the jvm so after this line entire program gets terminated

class Example1
{
	void test()
	{
		try
		{
			System.out.println("method stared");
			System.exit(0);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}

public class ExceptionFinallyVSSE {

	public static void main(String[] args) {

		Example1 example1 = new Example1();
		example1.test();
		
	}

}
