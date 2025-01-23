class ThreadName extends Thread
{
	@Override
	public void run()
	{

	}
}

class Example9 
{
	static public void main(String... arg)
	{
		ThreadName tn = new ThreadName();
		tn.start();

		System.out.println("New Thread Name : " + tn.getName());

		System.out.println("main Thread name : " + Thread.currentThread().getName());
	}
}