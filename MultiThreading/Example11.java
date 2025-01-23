class Example11
{
	public static void main(String...arg)
	{
		System.out.println("Creating a child Thread");
		Thread t = new Thread();

		System.out.println("Child Thread Priority " +  t.getPriority());
		System.out.println("Changing Child Priority : " ); 
		t.setPriority(7);
		System.out.println("Now child Thread priority is : "  + t.getPriority());
		// we have to change the thread priority before thread starts otherwise Exception
		t.start();

		System.out.println("main Thread Priority " + Thread.currentThread().getPriority());
	}
}
