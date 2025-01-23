package Interface.namingconflicts;

//if 2 interfaces contains a method with same name and same return type then one implementation in the child class is enough

interface One
{
	void m1();
	
}
interface Two
{
	void m1();
}
class GenImpl implements One, Two
{
	public void m1() {
		System.out.println("One method overriding is enough in this case");
	}
}

//if 2 interface contains same method and return type but different in the arguments then
//		two method implementation we should give and those will be treated as a overloaded methods

interface IFive
{
	void m4();
}
interface ISix{
	void m4(int i);
	
}
class Gen2Impl implements IFive, ISix
{
	public void m4()
	{
		System.out.println("without parameters");
		
	}
	public void m4(int i) {
		System.out.println("with parameters " + i);
	}
}

//if 2 interface contains the same methods with name and parameters but different in return type
//then it is not possible to give implementation simultaneously 

interface ISeven
{
	void m5();
}
interface IEight
{
	int m5();
}
//class Gen3Impl implements ISeven //,IEight
//{
//
//	public void m5()
//	{
//		System.out.println("this will result in compile time error");
//	}
//	
//}


public class MethodConflicts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
