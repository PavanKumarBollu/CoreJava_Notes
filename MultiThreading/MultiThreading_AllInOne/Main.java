class MyThread extends Thread
{
/* in threa class we have two important methods
		1. startMethod
		2. run method for the Runnable interface.
		
		public void start()
		{
			1.Registration for the Thread With ThreadScheduler
			2.All Lowlevel activities such as memory level activities 
			3.calling up the default run() method.
		}	
		public void run()
		{
			// dummy implementation for the run method to avoid making this class abstract.
		}

	*/

	@Override
	public void run()
	{
		// task for the current Thread.
		for (int i = 0; i < 5 ; i++ )
		{
			try
			{
				Thread.currentThread().sleep(2000);
				System.out.println("Child Thread");
			}
			catch (InterruptedException e)
			{
			}
			
		}

	}

}
class MyRunnable implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Implemented by Runnable Interface");
	}
}


class Main 
{
	public static void main(String[] args) 
	{
	// Creating up a Thread in Multiple ways is possible and Preffered way it by implementing the 
	//Runnable interface.

/*	1. creating a thread using the Thread Class.
	for doing the above activity we need a Class which will extends the Thread class and we need to override the Thread class run method inorder to give the task for the newly Created Thread.
	after that we need to create a object of that thread class and call the start() method to create a new Thread.
	then the main thread will execute those line it will create a new Thread 
	*/
	

	//MyThread myThread = new MyThread();
	//myThread.start();

//================================================================================

/*2. implementing Runnable Interface
		when ever we work with Runnable interface We need to make sure that following things are happening.

		Override run method and provide the task for the Thread.
		then create a Thread object and call the Thread Class constructor by passing the Runnable Interface Object Reference
		then call the start method on the above created Thread.
	*/

	// MyRunnable mr = new MyRunnable();

	//Thread t = new Thread(mr);

	//t.start(); 

//================================================================


/*3.alternative approach for creating a thread
		-->first create a Class which will extends the Thread class and provide the task for that Thread by Overriding the run method
		--> then create Thread using the Thread Class pass the object of the above Created thread. 
		--> this will work because the Thread which we have created is Exteding the Thread at that Thread class is implementing the Runnable interface
		so here indirectly we are passing the object which will implements the Runnable interface.

		NOTe: this is not a good approach. */
	
//MyThread t3 = new MyThread();

	//	Thread t4 = new Thread(t3);

	//	t4.start();


//===================================================================================


/* Thread class constructors 
	===========================
	important Thread Class Constructors
	a. Thread t=new Thread()
	b. Thread t=new Thread(Runnable r)
	c. Thread t=new Thread(String name)
	d. Thread t=new Thread(Runnable r,String name) */


// ============================================================================================


/*	Working with thread Names
	=========================

	in Java we can check the thread Names and at the same time we can also set thread names
	public String getName(); --> to get the name of the Thread
	publid void setName(String name); --> to set the name of the Thread.
	*/

	//System.out.println(Thread.currentThread().getName());
	//System.out.println("Trying to change the " + Thread.currentThread().getName() + " Thread name ");
	//Thread.currentThread().setName("Pavan");
	//System.out.println("Thread name has changed successfully ");
	//System.out.println("New name of the Thread " + Thread.currentThread().getName());


//======================================================================================================

/* 	Thread LifeCycle
	================
	the moment when you create a object of the thread class then it is in --> born state.
	the moment when you call start method then thread will be in --> ready or runnable state.
	the moment when Thread Scheduler allocates the time then it will be in --> running state.
	once the execution finishes then it will move to -->dead state.



	
	*/


//==============================================================================================

/* 		Thread Priority
		===============
		creation and starting of the main thread is in the control of JVM. we don't have any control on it.
		by defaultly the jvm creates main thread and gives the priority as 5
		--> minimus priority which you can set for a thread is 1
		--> maximus priority which you can set for a Thread is 10
		--> average priority whihc you can set for a Thread is 5.
		--> if you try to set the priority other than 1 - 10 the it will results in IllegalArgumentException


		when you create a thread inside the main method by defaultly what ever the main thread priority is there that priority will be set to the thread which is created by main Thread.

		NOTe:
		before starting up a thread we can set the priority */


		/* MyThread t = new MyThread();
		System.out.println("main Thread priority " + Thread.currentThread().getPriority());
		System.out.println("Child Thread priority of main Thread " + t.getPriority());
		t.setPriority(10);
		t.start();
		System.out.println("Changing the Thread priority after starting the therad");
		t.setPriority(7);
		System.out.println("After changing the Child Thread priority of main Thread " + t.getPriority());
*/
	

//=============================================================================================

/*		yield() Method
		==================
		yield method will check for waiting and if there is any waiting thread and that thread had the same priority then it will give a chances to that thread to execute
		if no thread is there in waiting queue or all other thread hav low priority then the current Thread will continues it's execution.
		NOTe: some os won't provide the support for the yield() method like windows7, widows10...etc.
	*/


	/*new MyThread().start();
	Thread.currentThread().yield();

	
			for (int i= 0; i < 5 ; i++ )
			{
				System.out.println("Main Thread");
			}
*/


//=====================================================================================================


/*		join() Method
		==================
		if the current thread has to wait for other thread to finish it's execution then we will use the join() method 
		lets say if you have t1, and t2 thread and t2 thread has to wait for t1 Thread then inside t2 Thread we need to mention the t1.join();
		join() is a checked Exception in java we must need to handle it otherwise our code won't compile*/

	/* MyThread t1 = new MyThread();
	t1.start();
	try
	{
		t1.join();
	}
	catch (InterruptedException e)
	{
		System.out.println(e.getMessage());
	}

	for (int i= 0; i < 5 ; i++ )
	{
		System.out.println("Main Thread");
	} */

//=========================================================================================

/*		sleep() Method
		==============
		sleep() is method java which is used for making a thead to slepp for some time and   a checked Exception in java we need to handle the exeception other wise our code won't even compile
		--> all availabel sleep methods
			sleep(int ms); milliseconds
			sleep(int ms, int ns); milliseconds and nano seconds

	*/

	/* MyThread t = new  MyThread();
	t.start();
	
	for (int i= 0; i < 5 ; i++ )
	{
		try{
			t.sleep(2000);//2sec sleep
			System.out.println("Main Thread");
		}
		catch (InterruptedException e){
			System.out.println(e.getMessage());
		}

		
	} */



//=====================================================================================================

/*Different Ways of Creating a Thread --> all possible ways of creating a the thread more Advanced Ways */

	
		/* Using Runnble Interface Annonymus Class 
			Runnable is an Functional Interface we can take the advantage and create Thread in Multiple Ways
			Runnable r = new Runnable(){
				@Override
				public void run()
				{
					System.out.println("Anonymus Thread");
				}
			};

			Thread t = new  Thread(r);
			t.start();  */


		//====================================================================================

		/* Using Lamda Expressions */
			/* Runnable r = ()->{
			System.out.println("Functional InterFace Thread");
			System.out.println(Thread.currentThread().getName());
			};	
			new Thread(r).start(); */

		//=========================================================================

		/* Directly Creating a Thread inside the Thread Constructor and passing */

			/* Thread t = new Thread(new Runnable(){
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Anonymus Runnable Object");
			}
			});
			t.start(); */


		//=========================================================================================

		/* Everything in single line */

			/* new Thread(()->{
				System.out.println("thread Is Created With : " + Thread.currentThread().getName());
				}).start(); */
		
		//=====================================================================================



// ==============================================================================
/*	Synchronization 
	===============
	is a process of allowing a single Thread to use the resources use at a time. 
	to promot synchronization we have the following ways.

	object level lock Or Synchronized Method
	========================================
	
	when you use synchronized keyword at your method syntax then when a Thread uses that method it will applies a lock on that Object.
	so Other Thread Which has to use that methods needs to wait for current Thread to finish it's Execution then this Thread Will Start 
	it's Execution.

	classlevel lock Or static synchronized Methods
	==============================================
	when use the synchronized keyword with static methods it will applies the lock at class level and Other Threads can't access the any static synchronized methods until the currentThread
	releses the lock.




	synchronized block 
	==================

	when you want to apply the lock for some lines of code in your project then synchronized block is used.

	Note: for code part please refere the programs section there you can find the all possible codes.
	
	*/

//================================================================================

/*	Inter Thread communication.
	=============================
	to avoid the problem of data inconsistancy we make sure that those Threads which are using the same resources 
	are communicating with each other properly and utilizes the resources properly.
	
	--> by using the following methods we can communicate with the Threads.
		wait();
		notify();
		notifyAll();
		Note: detailed explanation will there inside the programming files




	Deadlock
	============
	Daemon Threads.
	==============
*/

}
}
