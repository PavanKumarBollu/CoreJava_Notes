package Strings;

public class toLowerCase {
	public static void main(String[] args) {
		
		String str = new String("The Quick Brown Fox Jumps Over The Lazy Doz");
		
		
		String result = "";
		
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			{
				result +=  str.charAt(i);
			}
			else if (str.charAt(i) == ' ')
			{
				
				result += " ";
			}
			else
			{
				 result +=( char )(str.charAt(i)+32); // capital letter byte +32 will give the lowercase letter byte value
			}
		}
		
		System.out.println(result);
				 
		
		
		
	}
}
