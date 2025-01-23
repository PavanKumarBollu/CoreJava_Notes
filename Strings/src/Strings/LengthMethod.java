package Strings;

public class LengthMethod {

	public static void main(String[] args) {
		
		
		//length method basically returns the total number of characters present in String
		
		
		String str = new String("the quick brown fox jumps over the lazy dog");
		
		
		
		str = str.replace(" ", "");
		
		char[] ch = str.toCharArray();
		
		int strLength = 0;
		
		for(char c : ch)
		{
			strLength++;
			
		}
		System.out.println(strLength);

	}

}
