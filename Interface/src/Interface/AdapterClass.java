package Interface;

//adapter class is a class in java which gives the dummy implementation for the method of the interface
//so we don't need to give the implementation for the all the classes 
// by extending the adapter class we can give the implementation for the methods which we required

interface IAdapter
{
	public abstract void methodOne();
	public abstract void methodTwo();
	public abstract void methodThree();
	public abstract void methodFour();
	public abstract void methodFive();
	
}

class AdapterImpl implements IAdapter
{
	public void methodOne() {
		
	}
	public void methodTwo() {
		
	}
	public void methodThree() {
		
	}
	public void methodFour()
	{
		
	}
	public void methodFive()
	{
		
	}
}

class Test extends AdapterImpl
{
	public void methodFive()
	{
		System.out.println("giving the implementatin for the methodFive()");
	}
}



public class AdapterClass {
	public static void main(String[] args) {
		IAdapter adapter = new Test();
		adapter.methodFive();
		System.out.println("calling method four but you won't see anything as it is given only dummy implementation");
	}
}
