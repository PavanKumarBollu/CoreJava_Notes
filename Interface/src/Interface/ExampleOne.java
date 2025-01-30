interface i
{
	default void methodThree(){
		System.out.println(0);
	}

	private void methodFour()
	{
		System.out.println(1);
	}

	public static void methodFive()
	{
		System.out.println(2);
	}

}
class ExampleOne implements i
{
	public static void main(String[] args) 
	{
		new InterfaceNewMethods().methodThree();//line -1
		new InterfaceNewMethods().methodFour();//line -2
		new InterfaceNewMethods().methodFive();// line -3
	}
}
