 /* 
	Write a Program to Insert String Objects into the TreeSet 
	where the Sorting Order is of  Reverse of Alphabetical Order: 
 */
 import java.util.Comparator;
 import java.util.TreeSet;
class Comp implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)
	{
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		return str1.compareTo(str2);
	}
}

class Ex3
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new Comp());
		t.add("Pavan");
		t.add("Vijay");
		t.add("Padma");
		t.add("Tarun");
		t.add("Kutlu");
		System.out.println(t);
	}
}
