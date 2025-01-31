class Enums2 
{
	enum Colors
	{
		RED, GRENN, BLUE
	}
	public static void main(String[] args) 
	{
		// we can access the properties using the enum name bcz fields are by default public and static.
		// the return type of the field of the enum is always the same type of that enum
		Colors color =	Colors.RED;
		System.out.println(color);

		// to check all the values values parent in a anum we can call the values method
		Colors[] val = Colors.RED.values();
		//now we can loop through the array using any loop
		for(Colors c : val)
		{
			// ordinal is a method which will give the index of the particuler enum type
			// name is a method which will give the name of the feild(variable)
			System.out.println(c.ordinal() + " : " + c.name());
		}
	}
}
