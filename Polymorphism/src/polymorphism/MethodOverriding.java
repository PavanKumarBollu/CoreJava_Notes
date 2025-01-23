package polymorphism;

class Person
{
	String name = "Person";
	public void eat()
	{
		System.out.println("All the "+name+" will eat");
	}
	public void drink()
	{
		System.out.println("all the "+name+" will drink");
	}
	public void study()
	{
		System.out.println("may or maynot " + name + " will study");
	}
}
class Student extends Person
{
	public Student()
	{
		name = "Student";
	}
	public void study()
	{
		System.out.println("all the student know how to study");
	}
}
class Employee extends Person
{
	
	public Employee()
	{
		name = "Employee";
	}
	public void study()
	{
		System.out.println( name + " knows how to study");
	}
}
class Teacher extends Person
{
	public Teacher()
	{
//		name = "Teacher";
	}
	public void study()
	{
		System.out.println(super.name + " are the people who tought how to study");
	}
}

class PersonExecutor
{
	public void emp(Person p)
	{
		p.eat();
		p.drink();
		p.study();
		System.out.println("___________________________________________");
		System.out.println();
	}
}



public class MethodOverriding {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		Employee employee = new Employee();
		Teacher teacher = new Teacher();
		
		PersonExecutor personExecutor = new PersonExecutor();
		
		//passing different type of object to emp method which accept the parent type
		//this says that runtime polymorphism 
		personExecutor.emp(person);
		personExecutor.emp(student);
		personExecutor.emp(employee);
		personExecutor.emp(teacher);
		
	}
}
