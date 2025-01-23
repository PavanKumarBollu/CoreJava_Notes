class ClassLevelLock1 
{
	public static synchronized void displayChar()
	{
		System.out.println(Thread.currentThread().getName() + " Started using The DisplayChar Method ");
		for (int i = 65 ; i < 70 ; i++ )
		{
			try
			{
				System.out.print((char)i);
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " Stoped using the DisplayChar method ");
	}
	public static synchronized void displayNumbers()
	{
		System.out.println(Thread.currentThread().getName() + " Started using The DisplayNumbers Method ");
		for (int i = 1 ; i <=5 ; i++ )
		{
			try
			{
				System.out.print(i);
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " Stoped using the DisplayNumbers method ");
	}
}

class MyThreadCLLChar extends Thread
{
	public ClassLevelLock1 cll1;

	public MyThreadCLLChar(ClassLevelLock1 cll1)
	{
		this.cll1 = cll1;
	}

	@Override
	public void run()
	{
		cll1.displayChar();
	}
}

class MyThreadCLLNum extends Thread
{
	public ClassLevelLock1 cll1;

	public MyThreadCLLNum(ClassLevelLock1 cll1)
	{
		this.cll1 = cll1;
	}
	@Override
	public void run()
	{

		cll1.displayNumbers();
	}
}



class SSMethods1
{
	public static void main(String[] args) 
	{
		//Object for Threads to act on
		ClassLevelLock1 cll1 = new ClassLevelLock1();

		// Creating the Threads for Executing
		MyThreadCLLChar mtcc = new MyThreadCLLChar(cll1);
		MyThreadCLLNum mtcn = new MyThreadCLLNum(cll1);

		mtcc.start();
		mtcn.start();
	}
}
