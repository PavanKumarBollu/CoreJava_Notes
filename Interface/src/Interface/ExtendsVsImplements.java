package Interface;
//One class can extends only class at a time
class One {
	
}
class Two extends One
{
	
}

//One class can implements any no of interface at a time.

interface IOne
{
	void m1();
}
interface ITwo
{
	void m2();
}
class GenaralImpl1 implements IOne, ITwo
{
	public void m1()
	{
		System.out.println("interface one method");
	}
	public void m2()
	{
		System.out.println("interface two method");
	}
}


//A class can extend a class and can implements any no of interfaces simultaneously.
class GenaralImpl2 extends GenaralImpl1 implements IOne, ITwo
{
	
//	public void m2()
//	{
//		System.out.println("i am implementing the m2 method since my parent is an abstract");
//	}
	void test()
	{
		System.out.println("I don't need to implement the method since it was implemented by my parent GenaralImpl1 Class");
	}
}

//An interface can extend any no of interfaces at at time.

interface IThree extends IOne, ITwo
{
	void m3();
}













public class ExtendsVsImplements {

}
