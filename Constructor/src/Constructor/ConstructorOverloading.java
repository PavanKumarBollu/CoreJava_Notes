package Constructor;

class COverloading
{
	private String name;
	private int age;
	
	//when a class has more than one constructor then those constructors are said to be overloaded
	
	//default constructor
	
	public COverloading()
	{
		//this is default constructor
		this.name = "defaultname";
		this.age = 18;
	}
	//parameterized constructor
	public COverloading(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display()
	{
		System.out.println(" Name : " + name);
		System.out.println(" Age : " + age);
	}
}



public class ConstructorOverloading {

		public static void main(String[] args) {
			COverloading co = new COverloading();
			co.display();
			COverloading co1 = new COverloading("Pavan", 24);
			co1.display();
			
		
		}
}
