package Constructor;


class ConParent
{
	
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
}

class ConThis extends ConParent
{
	public ConThis()
	{
		//default constructor
		this("Pavan", 24);
		System.out.println("This is a default constructor ");
		
	}
	
	public ConThis(String name, int age)
	{
		this.setName(name); 
		this.setAge(age);
	}
	
}





public class ConstructorThis {
	public static void main(String[] args) {
		//by default constructor will include the default constructor
		//inside a constructor first line will be super() or this()
		//super() means parent constructor and this() means same class constructor
	}
}
