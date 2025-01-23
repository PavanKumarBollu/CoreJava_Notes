package Interface;

//Every variable present inside the interface is by default public static final.
// since the variables inside and interface is final we should initialize the value at the time of the declaration otherwise CE


interface IVariables
{
	//valid declarations 
	public static final int AA =10;
	public static int BB = 20;
	public final int CC = 30;
	public int DD = 40;
	
	int EE = 50;
	
	static int FF = 60;
	final int GG = 70;
	static final  int HH = 80;
}





public class InterfaceVariables implements IVariables {
	public static void main(String[] args) {
		
		
		//interface variables can be accessed from implementation class,but cannot modify if we try to modify
		//it would result in compile time error.
		
		
//		AA = 10;//CE
		System.out.println(AA);
		System.out.println("we can access the interface variables with or without the class name");
		
		
		//if a method contains a local variable with the same name of the interface variable
		//then the jvm will always considers the local variables if it is not exist then the interface variable will considers
		
		int BB = 200;
		System.out.println(BB);//local variable value will be printed 
		//to access the interface variable use the interface Name
		System.out.println(IVariables.BB);//interface variable is considered
	}
}
