package innerclass;

class TestClass
{
	void overRideMe()
	{
		System.out.println("this method will override");
	}
}


public class AnonymousClass {
	public static void main(String[] args) {
		
		
		//Anonymous class
		
		TestClass testClass = new TestClass()
				{
					public void overRideMe()
					{
						System.out.println("overriding successfull...?");
					}
				};
				
		testClass.overRideMe();
	}
}
