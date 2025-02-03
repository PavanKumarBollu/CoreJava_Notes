/*
	Problem: Write a Predicate to check whether the given String length is >=3 or not
*/
import java.util.function.Predicate;

class MyPredicTest implements Predicate<String>
{
	@Override
	public boolean test(String str){
		return str.length() >= 3;
	}
}

class PreEx1
{
	public static void main(String[] args) 
	{
		// Case1: Traditional Way
		//Create a class implement the Predicate and override the test Method
		boolean isGreater = new MyPredicTest().test("Pavan");
		System.out.println("Using the Treaditional Way \n" + isGreater);
		System.out.println();


		//Case2: Using Functional Expression Way
		//directly write the body for the test methods automatically compiler will binds it to Predicate test method
		Predicate<String> lamda = str -> str.length() >=3;
		System.out.println("using Lamda Expression");
		System.out.println(lamda.test("Pavan"));
		System.out.println();
	}
}
