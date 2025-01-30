import java.util.LinkedList;
// import java.util.*;

class LL 
{
	public static void main(String[] args) 
	{
		System.out.println("Linked Hash Set");
		System.out.println("The only defference between the HashSet and linked hashset is \nthe order of the elements is preseved in linkedHashSet\nMeans the order elements were inserted while accessing you can access in the same order");
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(99);
		ll.add(98);
		ll.add(97);
		ll.add(96);
		ll.add(95);

		System.out.println(ll);
		System.out.println("PollFirst Give and Modifies Existing List "+ll.pollFirst());
		System.out.println(ll);
		System.out.println("PollLast Give and Modifies Existing List "+ll.pollLast());
		System.out.println(ll);

	}
}
