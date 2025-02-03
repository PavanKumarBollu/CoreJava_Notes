/* 
Scope Resolution Operator ( :: )

Syntax for method References
----------------------------
		1. static method
			ClassName::methodName
		2. instance method
			object:: methodName

*/
class Test
{
	public static void dis()
	{
		for (int i= 0; i < 5 ; i++ )
		{
			System.out.println("New Thread");
		}
	}
}
class MethodReference 
{
	//static method reference
	public static void main(String[] args) throws Exception
	{
		Runnable r = Test::dis;// saying to jvm go to the Test Class and Find the method called dis() then bind that method with runnable interface run method
		//so that we call run method then that method will automatically executes the dis() method body


		new Thread(r).start();
		r.run();//Shows that run() and dis() methods are binded together
		for (int i= 0; i < 5 ; i++ )
		{
			System.out.println("Main Thread");
		}
	}
}
