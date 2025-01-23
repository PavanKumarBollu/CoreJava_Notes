class OverloadRun extends Thread
{
	public void run()
	{
		System.out.println("run With zero arguments");
	}
	public void run(int i)
	{
		System.out.println("run with arguments : " + i);
	}
}

class Example2
{
	public static void main(String... arg) throws InterruptedException
	{
		OverloadRun or = new OverloadRun();
		or.start();

		Thread.currentThread().sleep(1);
		System.out.println("calling the overloaded run method explicitly");

		or.run(5);
	}
}