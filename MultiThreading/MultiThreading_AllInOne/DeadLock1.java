class ThreadD1 extends Thread
{
	public static Thread t1;
	@Override
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " using this Object ");
			System.out.println(Thread.currentThread().getName() + " is waiting for the " + t1.getName() + " Thread" );
			t1.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}


class DeadLock1 
{
	public static void main(String[] args) 
	{
		ThreadD1.t1 = Thread.currentThread();
		System.out.println(Thread.currentThread().getName() + " using this Object ");

		ThreadD1 t2 = new ThreadD1();
		t2.start();

		try
		{
			System.out.println(Thread.currentThread().getName() + " is waiting for the " + t2.getName() + " Thread ");
			t2.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
