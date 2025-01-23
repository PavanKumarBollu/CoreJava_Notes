class ThreadName2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Child Thread Name : " + Thread.currentThread().getName());
		Thread.currentThread().setName("Child");
		System.out.println("Changing Child Thread Name : " + Thread.currentThread().getName());

		System.out.println(10/0);
	}
}
class Example10 
{
	public static void main(String... arg)
	{
		ThreadName2 tn1 = new ThreadName2();
		
		Thread t1 = new Thread(tn1);

		t1.start();

		System.out.println("Parent Thread Name : " + Thread.currentThread().getName());
		Thread.currentThread().setName("Main");
		System.out.println("Changing Parent Thread Name : " + Thread.currentThread().getName());
		

	}
}