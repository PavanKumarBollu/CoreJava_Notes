class DisplayObjectLevelLock
{
	public void wish(String name)
	{
		for (int i = 0; i < 5 ; i++ )
		{ 
			try
			{
				Thread.sleep(2000);
				System.out.print("Good Morning : ");
			}
			catch (InterruptedException e )
			{
				System.out.println(e.getMessage());
			}
			System.out.print(name);
			System.out.println("");
		}
		
	}

	public synchronized void wish1(String name)
	{
		System.out.println(Thread.currentThread().getName()+ " is Started Accessing the Object");
		for (int i = 0; i < 5 ; i++ )
		{ 
			try
			{
				Thread.sleep(2000);
				System.out.print("Good Evening : ");
			}
			catch (InterruptedException e )
			{
				System.out.println(e.getMessage());
			}
			System.out.print(name);
			System.out.println("");
		}
		System.out.println(Thread.currentThread().getName()+ " is Stopped Accessing the Object");
		
	}
}

class MyThreadOLL extends Thread
{
	DisplayObjectLevelLock doll;
	String name;

	public MyThreadOLL(DisplayObjectLevelLock doll, String name)
	{
		this.doll = doll;
		this.name = name;
	}

	@Override
	public void run()
	{
		doll.wish(name);
		doll.wish1(name);
	}
}



class SMethods1 
{
	public static void main(String[] args) 
	{
		//object for threads to act for
		DisplayObjectLevelLock doll = new DisplayObjectLevelLock();

		//case :1
		// synchronized keyword
		//creating multilple Threads to act on the Same Object
		MyThreadOLL t1 = new MyThreadOLL(doll, "Pavan");
		MyThreadOLL t2 = new MyThreadOLL(doll, "Kumar");
		
		t1.start();
		t2.start();

		//case:2
		//with syncronized keyword

	}
}
