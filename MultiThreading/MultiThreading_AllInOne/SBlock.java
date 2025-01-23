class SynchronizedBlock{
	public void dispalyCharNum()
	{
		for (int i = 0; i < 5; i++ )
		{	
			try
			{
				Thread.sleep(2000);
				System.out.println(i + " ByThread " + Thread.currentThread().getName());
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		synchronized(this)
		{
			System.out.println("Lock is applied by " + Thread.currentThread().getName());
			for (int i = 0; i < 5 ; i++ )
			{
				try
				{
					Thread.sleep(2000);
					System.out.println("syncronized block using by " + Thread.currentThread().getName());
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}

		synchronized(this)
		{
			for (int i = 65; i < 70; i++ )
			{
				try
				{
					Thread.sleep(2000);			
					System.out.println((char)i + " ByThread " + Thread.currentThread().getName());
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
}


class ThreadSync extends Thread
{
	SynchronizedBlock sb;
	public ThreadSync(SynchronizedBlock sb)
	{
		this.sb = sb;
	}
	@Override
	public void run()
	{
		sb.dispalyCharNum();
	}
}
class SBlock 
{
	public static void main(String[] args) 
	{
		//Object for Threads act on it
		SynchronizedBlock sb = new SynchronizedBlock();

		ThreadSync t1 = new ThreadSync(sb);
		ThreadSync t2 = new ThreadSync(sb);

		t1.start();
		t2.start();
	}
}
