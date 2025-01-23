package Strings.StringProblems;

import java.util.Arrays;

public class Anagram {

	// anagram is nothing but the two string which are having same alphabets in the string 
	// will be called anagram
	
	//Eg: 	a gentle Man
	// 		elegant Man 
	
	// 	both contains the same letters so they are called anagram
	
	
	public static void main(String[] args) {
		

		String str1 = "a gentle Man";
		String str2 = "elegant Man";//two string to check weather they are anagram or not
		
		System.out.println("Before Removing the all Blank Spaces String 1 = " + str1);
		System.out.println("Before Removing the all Blank Spaces String 2 = " + str2);

		
		//removing all the blanks;
		
		str1 = removeBlanks(str1);
		str2 = removeBlanks(str2);
		
		System.out.println("After Removing the all Blank Spaces String 1 = " + str1);
		System.out.println("After Removing the all Blank Spaces String 2 = " + str2);
		
		
		
		
		
		//converting the Strings into Arrays
		
		char[] ch1 = convertToArray(str1);
		char[] ch2 = convertToArray(str2);
		
		System.out.println("Bofore Sorting Array1 " + Arrays.toString(ch1));
		System.out.println("Bofore Sorting Array2 " + Arrays.toString(ch2));
		
		//sorting Using inbuilt methods
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		System.out.println("After Sorting Array1 " + Arrays.toString(ch1));
		System.out.println("After Sorting Array2 " + Arrays.toString(ch2));
		
		System.out.println();
		System.out.println();
		System.out.println("comparing the Values Please Wait.....");
		System.out.println();
		System.out.println();
		
		System.out.println(compare(ch1, ch2));
		
		
		
		
		
		
		
	}
	
	public static String removeBlanks(String str)
	{
		String res = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				res += str.charAt(i);
			}
		}
		
		
		return res;
	}
	
	
	public static char[] convertToArray(String str)
	{
		char [] res = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			res[i] = str.charAt(i);
		}
	
		return res;
	}
	
	public static String compare(char[] ch1, char[] ch2)
	{
		String result = "";
		
		if(ch1.length != ch2.length)
		{
			return result = "it is NOT a anagram....!";
		}
		for(int i= 0; i < ch1.length; i++)
		{
			if(ch1[i] != ch2[i])
			{
				return result = "it is NOT a anagram....!";
			}
			else
			{
				result = "It is a anagram....!";
			}
		}
		
		return result;
	}
	
	
	
	
	
}


