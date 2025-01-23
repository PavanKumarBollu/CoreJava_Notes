package Strings;

//write a method which will remove the white spaces in the string
//Eg: How a r e You ..? ==> HowareYou..?
//Eg: I Am g o o d... ! ==> IAmgood..!


public class RemoveWhiteSpaces {

	public static void main(String[] args) {
//		String str1 = "How a r e You ..?";
//		String str2 = "I Am g o o d... !";
//		System.out.println("Original String : " + str1);
//		
//		System.out.println( "Updated String : "+removeWhiteSpaces(str1));
//		System.out.println("=========================================");
//		System.out.println("Original String : " + str1);
//		System.out.println( "Updated String : "+removeWhiteSpaces(str2));

	}
	public static String removeWhiteSpaces(String str)
	{
		String result = "";
		char[] arr;
		arr = str.toCharArray();
		for(char c : arr)
		{
			if(c!= ' ')
			{
				result += c;
			}
		}
		
		return result;
	}
	
	
}
