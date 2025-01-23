// import java.lang.Thread;
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread");

		for(int i = 0; i < 5; i++)
		{
			System.out.println("Child");
		}
	}

}

class MultiThreading1 
{
	public static void main(String... args) 
	{
		MyThread mt = new MyThread();
		mt.start();
		

		System.out.println("Main Thread");
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Main");
		}

	}
}