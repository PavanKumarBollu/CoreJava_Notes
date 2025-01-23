import java.util.StringTokenizer;


class StringTokens
{
	public static void main(String[] args) 
	{
		String mailId = new String("pavankumar.g@teksacademy.com");

		StringTokenizer token = new StringTokenizer(mailId, "@");

		while(token.hasMoreTokens())
		{
			String valueOfToken = token.nextToken();
			System.out.println(valueOfToken);
		}

	}
}
