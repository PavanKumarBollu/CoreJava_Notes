class ChildThread extends Thread
{
	int total = 0;
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Started Using It");
		synchronized(this)
		{
			System.out.println(Thread.currentThread().getName() + " Has Applied Lock");
			for (int i = 1; i <= 10 ; i++ )
			{
				total += i;
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			this.notify();
			System.out.println(Thread.currentThread().getName() + " Has Realesed Lock");
		}

	}
}



class ThreadCommunications 
{
	public static void main(String[] args) 
	{
		ChildThread t1 = new ChildThread();
		t1.start();



		synchronized(t1)
		{
			System.out.println(Thread.currentThread().getName() + " is Calling the wait() method on t1 Thread Object ");
			try
			{
				t1.wait();
			}
			catch (InterruptedException e)
			{

			}
			System.out.println(Thread.currentThread().getName() + " Has Got The Lock");
			System.out.println("Main Thread Started It's Execution ");
			System.out.println(t1.total);


		}

		
	}
}
