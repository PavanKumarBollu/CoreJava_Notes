import java.util.*;

class Genarics2
{
	public static void main(String[] args) 
	{
		//case:1
		ArrayList<String> str = new ArrayList();
		str.add("Pavan");
		//str.add(10);CE


		//Case:2
		ArrayList al2 = new ArrayList<String>();
		al2.add("Pavan");
		al2.add(10);// valid

		//Case:3
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(11);
		//ll.add("Pavan");//CE


	}
}
