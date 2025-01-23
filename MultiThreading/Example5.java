class CallingStart extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread Started");
		/*for(int i = 0; i < 5; i++)
		{
			try
			{
				Thread.currentThread().sleep(1500);
			}
			catch (InterruptedException ie)
			{
			}
			System.out.println(i);
		}
		*/
	}
}

class Example5
{
	public static void main(String... arg) throws InterruptedException
	{
		CallingStart cs = new CallingStart();
		cs.start();
		System.out.println("Main Thread is Started The Child Thread");
		Thread.currentThread().sleep(2000);
		System.out.println("Trying to start the udifined thread again");
		cs.start();//IllegalThreadStateException
	}
}