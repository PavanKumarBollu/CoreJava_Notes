package finalKeyWord;

class FinalMethod
{
	//final method 
	final void disp()
	{
		System.out.println("this is a final method");
		System.out.println("it participates in the inheritance");
		System.out.println("but it won't allow you to override");
	}
}

class Child extends FinalMethod
{
	void disp()//can't override the final method in the child class
	{
		
	}

}

public class FinalMethodMain {
		
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
	}
}
