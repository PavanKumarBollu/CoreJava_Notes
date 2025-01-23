package Constructor;

class ConstructorExample
{
	private String name;
	private int age;
	
	
	//to set the value or execute the peace of code when you  instantiate the object 
	//then constructor is the perfect choice
	
	//default constructor
	
	public ConstructorExample()
	{
		//when you don't specify and constructor in the class compiler will automatically creates the default constructor
		//but if you specify any one constructor compiler won't create any constructor
	}
	
	
	//parameterized constructor
	public ConstructorExample(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void disp()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}



public class Constructor {

	public static void main(String[] args) {
		//object 
		
		ConstructorExample ce = new ConstructorExample();//creates an empty object without name and age values
		ce.disp();
		
		ConstructorExample ce1 = new ConstructorExample("Pavan", 24); //creates a object with name(Pavan) and age(24) values 
		ce1.disp();
	}
	
	
	
}

















