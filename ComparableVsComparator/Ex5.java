/*  Write a Program to Insert String and StringBuffer Objects into the TreeSet 
	where Sorting Order is Increasing Length Order. 
	If 2 Objects having Same Length then Consider their Alphabetical Order:
*/
import java.util.Comparator;
import java.util.TreeSet;

class CompStringBuffer1 implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		int lenth1 = str1.length();
		int lenth2 = str2.length();

		if(lenth1 < lenth2)
			return -1;
		else if(lenth1 > lenth2)
			return 1;
		else 
			return str1.compareTo(str2);
	}
}


class Ex5 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new CompStringBuffer1());
		t.add( new StringBuffer("K"));
		t.add( new StringBuffer("RI"));
		t.add( new StringBuffer("ISH"));
		t.add( new StringBuffer("SH"));
		t.add( new StringBuffer("HNA"));
		t.add( new StringBuffer("NA"));
		t.add( new StringBuffer("HNA"));
		t.add( new StringBuffer("INDIA"));
		t.add( new StringBuffer("ENG"));
		t.add( new StringBuffer("HPL"));
		t.add( new StringBuffer("BBL"));
		System.out.println(t);

	}
}
