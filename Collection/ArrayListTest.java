import java.util.ArrayList;
//import java.util.*;


class ArrayListTest 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		//System.out.println(al);
		al.add(0, 10);
		//System.out.println(al);


		ArrayList al2 = new ArrayList();
		al2.add(8);
		al2.add(9);
		al2.add(10);
		al2.addAll(al);// add the all the collection Objects into al2 ArrayList

		System.out.println(al2);
		System.out.println(al2);

		ArrayList al3 = new ArrayList(20);
		al3.add(19);
		al3.add(20);
		al3.addAll(0,al2);//adds the all the collection objects into al2 ArrayList from 0th index.
		System.out.println(al3);

		System.out.println(al3.getFirst());
		System.out.println(al3.getLast());
		System.out.println(al3.get(4));


	}
}
