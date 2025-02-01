class Gen<T>
{
	private T object;
	public Gen(T object )
	{
		this.object = object;
	}
	public T getObj()
	{
		return this.object;
	}
	public void show()
	{
		System.out.println("Name Of the Class : " + object.getClass().getName()); 
		System.out.println(getObj());
	}
}
class UDGenarics 
{
	public static void main(String[] args) 
	{
		Gen <Integer> g1 = new Gen<Integer>(10);
		g1.show();
		Gen <String> g2 = new Gen<String>("Pavan");
		g2.show();
		Gen <Double> g3 = new Gen<Double>(95.5);
		g3.show();
		Gen <Boolean> g4 = new Gen<Boolean>(true);
		g4.show();
		
		//System.out.println(g1.show());
	}
}