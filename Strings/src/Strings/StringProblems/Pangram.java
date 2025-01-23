package Strings.StringProblems;

public class Pangram {

	//pangram means the String Should contain all 26 alphabets,
	//alphabets may repeat n number times
	
	//65 or 97 which is A and a values 
	
	public static void main(String[] args) {
		
		String pangram = "the quick brown fox jumps over the lazy dog";
		System.out.println(pangram.length());
		
		//removing blank spaces
		pangram = removeBlanks(pangram);
		System.out.println(pangram.length());
		
		
		
		
		//int array to store the character presence in the String
		int [] pangramPresence = new int[26];
		
		//converting the String to upperCase
		pangram = pangram.toUpperCase();		
		
		//going through the string characters one by one
		
		for(int i = 0; i < pangram.length(); i++ )
		{
			pangramPresence[pangram.charAt(i)-65]++;
		}
		
		boolean flag = true;
		for(int e : pangramPresence)
		{
			
			if(e == 0)
			{
				flag = false;
				break;
			}
	
			
		}
		if(flag)
		{
			System.out.println("It is A Pangram....!");
		}
		else
		{
			System.out.println("It is NOT a Pangram....!");
		}
		
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
	
	
	
	
}
