import java.util.HashSet;
import java.util.*;


class HS 
{
	public static void main(String[] args) 
	{
		System.out.println("HashSet");
		System.out.println("HashSet internally uses the hasing algorithm which is contains\ntwo main parts one is hashing function\nsecond is hasing table\nby using the hasing function it will do some calculation based on the results it will go and store in some bucket of the hash Table\nwhen the 75% of the buckets are filled automatically the hashSet size will be increased to double\nthis we will call it as load factor 75%");
		System.out.println("duplicates are not allowed ");


		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(8);
		hs.add(7);
		hs.add(6);
		hs.add(5);
		hs.add(3);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		System.out.println(hs);

		Iterator c =	hs.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}


	}
}
