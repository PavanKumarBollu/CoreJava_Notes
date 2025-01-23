class OverrideStartSuper extends Thread
{
	@Override
	public void start()
	{
		super.start();//this line will call the start() method of the Thread class
		System.out.println("Over ridden start method is ended ");
	}
	@Override
	public void run()
	{
		System.out.println("run method is called because of the super.start() line in the overriden start method ");
		System.out.println("Current Thread Name: " + Thread.currentThread().getName());
	}

}
class Example4
{
	public static void main(String... arg)
	{
		OverrideStartSuper oss = new OverrideStartSuper();

		oss.start();
		System.out.println("current thread name: " + Thread.currentThread().getName());
		System.out.println("Main method Ended:");
	}
}