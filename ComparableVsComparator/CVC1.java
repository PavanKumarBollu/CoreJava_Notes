import java.util.*;
class CVC1 
{
	public static void main(String[] args) 
	{	//sorting will happen based on the default sorting order
		TreeSet t = new TreeSet();

		t.add('A');
		t.add('Z');
		t.add('D');
		t.add('B');
		//t.add(null);//nullPointerException
		//t.add("Pavan");//ClassCastException
		System.out.println(t);//[A, B, D, Z]
		
	}
}
