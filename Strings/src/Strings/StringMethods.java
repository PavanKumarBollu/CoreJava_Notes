package Strings;

import java.util.Arrays;

public class StringMethods {
		
	//method1
	//ToUpperCase
	public String toUpperCase(String str)
	{
		String result ="";
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)>= 'A' && str.charAt(i) <= 'Z')
			{
				result += str.charAt(i);
			}
			else if(str.charAt(i) == ' ')
			{
				result += str.charAt(i);
			}
			else
			{
				result += (char)(str.charAt(i)-32);
			}
		}		
		return result;
	}
	//2 Method
	// toLowerCase
	
	public String toLowerCase(String str)
	{
		String result = "";
		
		for(int i = 0; i< str.length(); i++)
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
				result += (char)(str.charAt(i)+32);
			}
		}
		return result;
	}
	
	// 3 method
	// equals method
	
	public boolean eqauls(String str1, String str2)
	{
		boolean flag = true;
		
		if(str1.length() != str2.length())
		{
			flag = false;
			return flag;
		}
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				flag =false;
				return flag;
			}
		}
		
		
		return flag;
	}
	
	// 4 method
	// equalsIgnoreCase
	
	public boolean eqaulIgnoreCase(String str1, String str2)
	{
		boolean flag = true;
		
		if(str1.length() != str2.length())
		{
			flag = false;
		}
		
		str1 = toLowerCase(str1);//using my own toLowerCase method
		str2 = toLowerCase(str2);//using my own toLowerCase method
		
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				
				return flag = false;
			}
		}
		return flag;
	}
	
	// 5 method
	// replace
	//need to update the logic
//	public String replace(String str, char old , char fresh)
//	{
//		String result = "";
//		
//		char[] ch = str.toCharArray();
//		
//		int length = ch.length;
//		
//		for(int i = 0; i < length; i++)
//		{
//			if(ch[i]== old)
//			{
//				ch[i]= fresh;
//			}
//		}
//		
//		
//		
//		return Arrays.toString(ch);
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
