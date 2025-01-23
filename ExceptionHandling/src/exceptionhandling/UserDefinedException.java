package exceptionhandling;

class MyException extends RuntimeException
{
	public MyException(String str)
	{
		super(str);
	}
}
class Final
{
	public void disp(int num)
	{
		
		if(num <= 0)
		{
			throw new MyException("Please enter Possitive Age");
		}
		else
		{
			System.out.println("Thank you..?");
		}
			 
			 
		 
	}
}

public class UserDefinedException{
		public static void main(String[] args){
			
			Final final1 = new Final();
			final1.disp(1);
		}
}
