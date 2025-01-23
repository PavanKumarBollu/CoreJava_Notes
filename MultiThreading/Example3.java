class OverrideStart extends Thread
{
	@Override
	public void run()
	{
		System.out.println("this line won't Execute until you call it");
	}

	//the following start method will not create any thread and won't start the run method 
	// automatically so no thread will be created


	@Override
	public void start()
	{
		System.out.println("this is overriden method");
	}
}

class Example3
{
	public static void main(String... arg)
	{
		OverrideStart os = new OverrideStart();
		os.start();
	}

}