package exceptionhandling;

//finally > return
class Example
{
	public int disp()
	{
		try {
			System.out.println("display method started ");
			return 20;
		}
		finally
		{
			System.out.println("finally block ");
		}
		
	}
}

public class ExceptionFinallyVsReturn {

	public static void main(String[] args) {
		
		Example example = new Example();

		System.out.println(example.disp());
	}

}
