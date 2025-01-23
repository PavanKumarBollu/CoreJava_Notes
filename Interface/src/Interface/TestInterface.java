package Interface;


interface ITest
{
	//	by default methods are public and abstract if you mention or not
	public abstract void test();
	void test1();//public and abstract will come automatically
	void test2();//public and abstract will come automatically
	
}

abstract class TestImpl implements ITest
{
	
	public void test1()
	{
		System.out.println("if a parent class is not providing the implementions of the all interface methods");
	}
	public void test2()
	{
		System.out.println(" then child of the abstract class must implement it otherwise CE");
	}
}

class ChildTestImpl extends TestImpl
{
	public void test()
	{
		System.out.println("implementing the all unimplemented methods abstract class which are not implemented");
	}
}


public class TestInterface {
	public static void main(String[] args) {
		
		ITest i = new ChildTestImpl();
		
		i.test1();
		i.test2();
		i.test();
	}
}
