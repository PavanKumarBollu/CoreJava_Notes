@FunctionalInterface
interface fun
{
	public abstract void dis(String name);
}



class MethodReference1 
{
	public static void main(String[] args) 
	{
		System.out.println("Using lamda Expression : ");
		fun f = str -> System.out.println("Lamda Expresion : " + str + "\n" );
		f.dis("Pavan");


		System.out.println("Using Method Referneces");

		// binding the static method 
		fun f1 = MethodReference1::disFromMain;
		f1.dis("Static method Binding");

		// binding the non static method to the interface methods

		fun f2 = new MethodReference1()::d;
		f2.dis("non Static method Binding");
	
	}

	public static void disFromMain(String name){
		System.out.println("Dis method is binded : " + name) ;
		System.out.println() ;
	}
	public  void d(String name){
		System.out.println("d method is binded : " + name) ;
		System.out.println() ;
	}

}
