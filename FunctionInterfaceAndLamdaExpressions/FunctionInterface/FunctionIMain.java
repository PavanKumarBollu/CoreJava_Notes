/*
	Function is a Functional Interface Paresent in java.util.function.Function
	 public interface java.util.function.Function<T, R> {
		 T- type
		 R- Return Type
	 }
*/

import java.util.function.Function;

class MyFunction implements Function<String, Integer>
{
	@Override
	public Integer apply(String name)
	{
		return name.length();
	}
}

class FunctionIMain 
{
	public static void main(String[] args) 
	{
		Integer length1 = new MyFunction().apply("Pavan");

		System.out.println("using the Treaditional Ways : "+length1);


		Function<String, Integer> length2 = str -> str.length();

		System.out.println("using the Lamda Expresions Ways : "+length2.apply("Pavan"));


	}
}
