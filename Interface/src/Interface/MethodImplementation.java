package Interface;

//Whenever we are implementing an interface method compulsory it should be 
//declared as public otherwise it would result in 
//CompileTime Error.
interface IDemo
{
	public abstract void m1();
	public void m2();
	
}

abstract class DemoImpl implements IDemo
{
	public void m1()
	{
		System.out.println("method 1 of the interface");
	}
}
class Demo extends DemoImpl
{
	public void m2()
	{
		System.out.println("method 2 of the interface");
	}
}


public class MethodImplementation {

	public static void main(String[] args) {
		IDemo demo = new Demo();
		demo.m1();
		demo.m2();
	}
}
