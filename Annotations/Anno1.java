@FunctionalInterface
interface In
{
	void dis();
	// public abstract void dis();
}
class Overriding
{
	public void over()
	{
		System.out.println("this method will overrided ");
	}
}
class testOver extends Overriding
{
	@Override
	public void over()
	{
		System.out.println("Override annotation \n\n\n");
	}
}

class Anno1 
{
	public static void main(String[] args) 
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("1. Annotations are used to indications at different levels \n");
		System.out.println("2. Parent of all the annotations is Annotation \n");
		System.out.println("3. The possible levels where you can say the annotaions is \n");
		System.out.println("\tClassLevel \n\tMethodLevel \n\tInterfaces \n\tFeilds(Instance Var) \n\tLocalVariables \n\tConstructors \n\tParameters \n\tEnums \n");

		System.out.println("4.Annotations are two types: \n\n\tInbuilt \n\tUserDefined \n");
		System.out.println("Examples of inbuilt Annotaions are: \n");
		System.out.println("\tFunctional Interface \n\tOverride \n\tDeprecated \n\t...\n\tetc \n\n\n");

		In i = () -> {
			System.out.println("FunctionalInterface Annotation is used\n\n\n\n\n\n");
		};

		i.dis();

		

		
	}
}
