import java.util.*;
class Genarics1 
{
	public static void main(String[] args) 
	{
		/*1.4v */
		ArrayList al = new ArrayList();//1.4v can add anything
		al.add("Pavan");
		al.add(25);
		System.out.println(al);

		/*1.5v Type Safety */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Pavan");
		names.add("Shagu");
		//names.add(143);//ce


		System.out.println(names);
		System.out.println();
	}
}
