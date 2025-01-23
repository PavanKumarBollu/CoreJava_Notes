class MyRunnable implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Implemented Runnable Interface");
	}

}

class Example6
{
	static public void main(String... args)
	{
		MyRunnable mr = new MyRunnable();

		Thread t = new Thread(mr);

		t.start();
	}
}