import java.util.*;

class CVC2 
{
	public static void main(String[] args) 
	{
		//note : StringBuffer won't implement the Comparable Interface
		TreeSet  t = new TreeSet ();
		t.add(new StringBuffer("P"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("N"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("P"));

		System.out.println(t);;;;;

	}
}
