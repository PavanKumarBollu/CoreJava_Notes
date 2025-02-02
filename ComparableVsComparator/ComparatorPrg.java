//Comparator prasent in java.util package
/* 
	public int compare(Object obj1, Object obj2) 
*/

import java.util.*;
class MyComparator implements Comparator
{
	@Override
	public int compare(Object obj1 /* target*/, Object obj2 /* base*/)
	{
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		System.out.println( " Obj1 Value : " + i1);
		System.out.println( " Obj2 Value : " + i2);
		System.out.println();

		//default sorting order
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return +1;
		else
			return 0;


	}
}


class ComparatorPrg
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new MyComparator());// at this line we need to pass the MyComparator Class Object to the Constructer otherwise 
													//it will call the default comparable compare() Method
		t.add(10);
		t.add(1);
		t.add(31);
		t.add(12);
		t.add(11);
		t.add(143);

		System.out.println(t);
	}
}
