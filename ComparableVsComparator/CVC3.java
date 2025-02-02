import java.util.*;

class CVC3 
{
	public static void main(String[] args) 
	{
		
		/* Example one
		System.out.println('A'.compareTo(''));
		System.out.println('B'.compareTo('A'));// +ve
		System.out.println('A'.compareTo('A'));//-ve
		System.out.println('Z'.compareTo('A'));//+ve --> 'Z'.compareTo('B'); // +ve
		System.out.println('Z'.compareTo(null));//NPE
		*/

		//Example Two
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(5);
		t1.add(3);//3.compareTo(5);//-ve
		t1.add(2);//2.compareTo(5);//-ve
		t1.add(1);//1.compareTo(5);//-ve
		t1.add(7);//7.compareTo(5);//+ve

		System.out.println(t1);
		
	}
}
