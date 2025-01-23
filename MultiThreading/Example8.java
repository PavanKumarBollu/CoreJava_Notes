// this way of creating a new thread is not recomended bez 
class MyThread2 extends Thread
{
	@Override 
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

class Example8 
{
	public static void main(String... arg)
	{
		MyThread2 mt = new MyThread2();

		Thread t = new Thread(mt);
		t.start();

		System.out.println(Thread.currentThread().getName());

	}
}
