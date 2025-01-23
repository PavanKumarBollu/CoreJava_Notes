package Static;

class Static
{
	//1.static variable memory initialization 
	//2.static block
	//3.static method(only main method)
	//4.instance variable memory initialization
	//5.instance block
	//6.constructor execution
	//7.normal method execution
	
	
	//class variables 
	private static String name;
	static private float no;
	//instance variables
	int age;
	
	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Static.name = name;
	}


	public static float getNo() {
		return no;
	}


	public static void setNo(float no) {
		Static.no = no;
	}


	static
	{
		name = "Pavan";
		no = 9581950211f;
		//age =24; //instance variable can not accessed in static block
	}
	{
		age = 24;//instance variables can be accessed in java block
		System.out.println("1.this is java initialization block");
	}
	
	public Static()
	{
		System.out.println("2. this is a constructor ");
	}
	
	public void dis()
	{
		System.out.println("3.this is a display method");
	}
	
}



public class StaticKeyword {
	public static void main(String[] args) {
		
		Static st = new Static();
		st.dis();
		
	}
}
