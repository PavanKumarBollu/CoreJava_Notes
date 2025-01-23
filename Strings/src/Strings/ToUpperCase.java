package Strings;

public class ToUpperCase {
	public static void main(String[] args) {
		
		//converting the string to upper case
		
		String name = new String("Pavan");
		String nameUpperCase = "";
		
		for(int i = 0; i < name.length(); i++)
		{
			//check weather the letter is already in upperCase
			if(name.charAt(i) >= 'A' && name.charAt(i)<= 'Z')
			{
				nameUpperCase += name.charAt(i);
			}
			else
			{
				nameUpperCase += (char)(name.charAt(i)-32);
			}
		}
		
		//printing the name to the console
		System.out.println(nameUpperCase);
		
	}
}
