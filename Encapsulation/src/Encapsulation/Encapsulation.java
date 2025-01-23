package Encapsulation;

class Example
{
	private String name;
	private String city;
	private int age;
	private boolean married;
	
	
	public void setName(String name)
	{
		this.name  = name;
		
	}
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public boolean isMarried()
	{
		return married;
	}
	public void setMarried(boolean married)
	{
		this.married = married;
	}
}



public class Encapsulation {

	
		public static void main(String[] args) {
			Example ex = new Example();
			
			ex.setName("Pavan");
			System.out.println("Name : " + ex.getName());
			
			ex.setCity("HYD");
			System.out.println("City : " + ex.getCity());
			
			ex.setAge(24); 
			System.out.println("Age : " + ex.getAge());
			
			ex.setMarried(false);
			System.out.println("is Married : " + ex.isMarried());
		}
	
	
}
