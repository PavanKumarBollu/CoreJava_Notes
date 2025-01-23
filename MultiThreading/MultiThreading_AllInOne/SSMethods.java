class ClassLevelLock
{
	private static int total = 0;
	public static int sum(int start , int end)
	{
	
		System.out.println(Thread.currentThread().getName()+" is Started Accessing the Object ");
		//making the Thread to Sleep to make sure that it's giving the chance to another thread without classLock
		try
		{
			Thread.sleep(2000);
			for (int i = start; i <= end ; i++ )
			{
				total += i;
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread().getName()+" is Done With Accessing the Object ");
		return total;
	}

}



class SSMethods 
{
	public static void main(String[] args) 
	{
		//Object of ClassLevelLock which we are going to access.
		ClassLevelLock cll = new ClassLevelLock();


		//creating multiple threads to act the single object, to create data inconsistance problem

		new Thread(()->{
			int a = 1, b =10;
			System.out.println("The Sum Of The Numbers from " + a + " to " + b + " is : " + cll.sum(a,b));
		}).start();
		

		new Thread(()->{
			int a = 10, b =20;
			System.out.println("The Sum Of The Numbers from " + a + " to " + b + " is : " + cll.sum(a,b));
		}).start();



	}
}
