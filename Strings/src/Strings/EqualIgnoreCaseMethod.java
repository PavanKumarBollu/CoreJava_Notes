package Strings;

public class EqualIgnoreCaseMethod {
	
	public static void main(String[] args) {
		
		String str1 = new String("PAVAN");
		String str2 = "pavan";
		
		System.out.println("String : " + str1 + " and " + str2 + " are Same : "  + 	equalIgnoreCase(str1, str2));
		
	}
	
	
	public static boolean equalIgnoreCase(String str1, String str2)
	{
		boolean flag = true;
		
		if(str1.length() != str2.length())
		{
			flag = false;
		}
		
		//writing the own Method for converting the characters to lowerCase 
		
		str1 = convertToLowerCase(str1);
		str2 = convertToLowerCase(str2);
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				flag = false;
			}
		}
		
		return flag;
	}
	
	
	
	public static String convertToLowerCase(String str) 
	{
		String result = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				result += str.charAt(i);
			}
			else if(str.charAt(i) == ' ')
			{
				result += " ";
			}
			else
			{
				result += (char) (str.charAt(i)+32);
			}
		}
		
		return result;
	}
	
	
}
