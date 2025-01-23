package Strings;

public class EqualsMethod {
	
	public static void main(String[] args) {
		
		//comparing the to string and returning true if the content of the strings are equal
		
		String str1 = new String ("Pavan");
		String str2 = "Pavan";
		
		System.out.println("Both strings are Equal : " + equal(str1, str2));
		
		
	}
	
	public static boolean equal(String str1, String str2)
	{
		boolean flag = true;
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				flag = false;
				return flag;
			}
		}
		
		return flag;
	}
	
}
