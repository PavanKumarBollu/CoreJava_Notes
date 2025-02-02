import java.util.Comparator;
import java.util.TreeSet;

class Com implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)//Obj1 is new Element Obj2 is the Base Element
	{
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		//return i1.compareTo(i2);//schending Order
		//return -i2.compareTo(i1);//aschending Order
		//return -i1.compareTo(i2);//Deschending Order
		//return i2.compareTo(i1);//Deschending Order
		//return +1;//Default Insertion Order
		//return -1;// reverse of default insertion order
		//return 0;//only first Element will be inserted
	}
}

class EX2 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Various possible ways of implementing the compare() method logic");
		TreeSet t = new TreeSet(new Com());
		t.add(10);
		t.add(5);
		t.add(11);
		t.add(90);
		t.add(45);
		t.add(17);
		t.add(1);
		System.out.println(t);

	}
}
