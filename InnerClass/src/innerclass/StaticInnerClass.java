package innerclass;
class A
{
	public void show()
	{
		System.out.println("Static class can be accessed using the Class Name");
	}
	static class B 
	{
		public void config()
		{
			System.out.println("you call me with the help of outer class name when inner class is static");
		}
	}
}

public class StaticInnerClass {
		public static void main(String[] args) {
			A a = new A();
			a.show();
			
			//inner class object
			
			A.B b = new A.B();
			
			b.config();
		}
}
