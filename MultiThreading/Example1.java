class DefaultRunMethod extends Thread
{
	// we are not overriding the run method so default run method will execute which has
	// no implementation so we will not get any output this time
}

class Example1
{
	public static void main(String... arg)
	{
		DefaultRunMethod drm = new DefaultRunMethod();
		drm.start();
		System.out.println("End of main thread");
	}
}