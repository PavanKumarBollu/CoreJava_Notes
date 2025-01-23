package innerclass;

class OuterClass
{
	public void outerDis()
	{
		System.out.println("this is the outer class method");
	}
	class InnerClassOfOuterClass
	{
		public void outerDis()
		{
			System.out.println("this is the inner class method");
		}
	}
}

public class InnerClass {
	//inner class has the access to outer class private variables
	
	
	public static void main(String[] args) {
		//outer class object
		 OuterClass outerClass = new OuterClass();
		 outerClass.outerDis();
		 
		 //innerClass object
		 OuterClass.InnerClassOfOuterClass c = outerClass.new InnerClassOfOuterClass();
		 c.outerDis();
	}
}
