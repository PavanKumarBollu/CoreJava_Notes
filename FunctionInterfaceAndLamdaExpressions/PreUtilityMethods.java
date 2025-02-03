import java.util.function.Predicate;


class PreUtilityMethods 
{
	public static void main(String[] args) 
	{
		int[] ele = {10,2,4,5,14,12,19,20, 15,17,11};

		// to get the elements Greater Then 10
		Predicate<Integer> p1 = i -> i > 10;
		System.out.println("Elements Greater then 10 Is :: ");
		m1(p1, ele);

		//Predicate for getting the even Numbers
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("Elements Which are Even Is :: " );
		m1(p2, ele);

		// to get the elements grether then 10 and even 
		System.out.println("Elements Greater then 10 and Even Both: ");
		m1(p1.and(p2), ele);// using and utility method

		// to get the elements greter than 10 and odd
		System.out.println("Elements Greater then 10 and Odd Both: ");
		m1(p1.and(p2.negate()), ele);// using negate(), and () utility method


		// to get the elements which are odd may or maynot greter than 10 
		System.out.println("Elements Which are Greater then 10 May are maynot even : ");
		m1(p1.or(p2.and(p1)), ele);// using OR utility method


	}

	public static void m1(Predicate<Integer> p, int[] arr){
		for(int ele : arr)
			if(p.test(ele))
				System.out.print(ele + " ");
		
		System.out.println();
	}
}
