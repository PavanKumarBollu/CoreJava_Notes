interface i
{
	// by default methods are public and abstract but now we can have the methods with body in interface also
	//void methodOne(); // --> public abstract void methodOne();

	//
	//void methodTwo();// --> public abstract void methodTwo();
	// new ways of having methods inside the interface
	default void methodThree(){
		System.out.println("inside Interface method");
		System.out.println("Participates in the Inheritance ");
		System.out.println("calling the private methods");
		System.out.println("*********************************");
		methodFour();
	}
	private void methodFour()
	{
		System.out.println(" ");
		System.out.println("inside Interface private method");
		System.out.println("won't participate in the inheritance");
		System.out.println("calling Interface satic method");
		System.out.println("*****************************************");
		methodFive();
	}
	public static void methodFive()
	{
		System.out.println(" ");
		System.out.println("inside Interface static method");
		System.out.println("won't participate in the inheritance");
		System.out.println("********************************************");
	}
}
class InterfaceNewMethods implements i
{
	public static void main(String[] args) 
	{
		//public void methodOne(){};
		//public void methodTwo(){};
		//System.out.println("");
		new InterfaceNewMethods().methodThree();
		//new InterfaceNewMethods().methodFour();
		//new InterfaceNewMethods().methodFive();
		//i.methodThree();
	}
}
