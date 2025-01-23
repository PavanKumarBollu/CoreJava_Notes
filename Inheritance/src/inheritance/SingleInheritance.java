package inheritance;

class SuperClass
{
	public void disp()
	{
		System.out.println("SuperClass Display");
	}
}

class SubClass extends SuperClass
{
	
}


public class SingleInheritance {

	public static void main(String[] args) {
		// calling the parent disp() method using the child object
		
		SubClass subClass = new SubClass();
		
		subClass.disp();
	}
}
