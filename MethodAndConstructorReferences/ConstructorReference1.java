class Bind
{
	String name;
	Bind(String name)
	{
		this.name = name;
		System.out.println("Constructor is called with  : " + name);
	}
}
@FunctionalInterface
interface InterFace
{
	public abstract void test(String str);
}


class ConstructorReference1
{
	public static void main(String[] args) 
	{
		InterFace t1 = str -> new Bind(str);
		System.out.println("From Lamda Expression " );
		t1.test("Pavan");
		System.out.println();

		System.out.println("From Constructor Binding Expression " );
		InterFace i2 = Bind :: new;
		i2.test("Pavan");
	}
}
