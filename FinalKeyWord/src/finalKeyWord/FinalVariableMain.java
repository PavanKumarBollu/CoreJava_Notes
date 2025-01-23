package finalKeyWord;

class FinalVariable
{
	final String name;
	final static int age;
	
	{
		name = "Pavan";
	
	}
	static
	{
		age = 24;
	}
}




public class FinalVariableMain {

	public static void main(String[] args) {
		
		
		FinalVariable fv = new FinalVariable();
		
		System.out.println(	fv.name);
		
		fv.name = "Kumar"; //bcz of the final keyword we can't change the address of the variable 
		
	}

}
