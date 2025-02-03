/*
	Predicate is a functional Interface it should contain only one abstract method
	public boolean Test(T);
	--> it is present inside java.util.function.Predicate;

*/

import java.util.function.Predicate;

// normal way of writing the predicate for testing 
class Predic implements Predicate<Integer>{

	@Override
	public boolean test(Integer i){
	
		if(i > 18)
			return true;
		else
			return false;
	}
}

/* class PredicateMain
{
	public static void main(String[] args) 
	{
		boolean isEligible = new Predic().test(25);
		System.out.println(isEligible);
	}
}
*/
//Using Lamda Expressions
 class PredicateMain
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p = i -> i >= 18;// Lamda Expression
		System.out.println(p.test(15));
		System.out.println(p.test(18));
		System.out.println(p.test(21));
	}
}

/* 	 default methods available as utility  methods for developer
     ===========================================================

		public default  Predicate<T> and(Predicate p);
		public defualt  Predicate<T> negate();
		public default  Predicate<T> or(Predicate p);


*/
