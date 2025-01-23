package exceptionhandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String str)
	{
		super(str);
	}
}
class OverAgeException extends Exception
{
	

	public OverAgeException(String str)
	{
		super(str);
	}
}

class Applicant
{
	int age;
	Scanner sc = new Scanner(System.in);
	public int inputAge()
	{
		System.out.println("enter your age : ");
		age = sc.nextInt();	
		return age;
	}
	public void verifyUser() throws UnderAgeException, OverAgeException
	{
		if(age>60)
		{
			OverAgeException oae = new OverAgeException("you are already passed this stage...");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else if(age<18) {
			UnderAgeException uae = new UnderAgeException("in future you are going to enter into that stage don't worry ");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else
		{
			System.out.println("Your are in the stage to get the licence");
		}
	}
	
}

class Verification
{
	public void verifyApplicant()
	{
		Applicant a  = new Applicant();
		try
		{
			a.inputAge();
			a.verifyUser();
		}
		catch(UnderAgeException | OverAgeException e)
		{
			try
			{
				a.inputAge();
				a.verifyUser();
				
			}
			catch(UnderAgeException | OverAgeException e1)
			{
				System.out.println("can not procide with you this time try again in the future...");
			}
		}
	}
	
	
}

public class ExceptionNestedTryCatch {

	public static void main(String[] args) {

		Verification verification = new Verification();
		verification.verifyApplicant();
		
	}

}
