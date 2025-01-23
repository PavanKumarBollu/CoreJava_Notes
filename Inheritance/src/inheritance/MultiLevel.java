package inheritance;

class Multi1
{
	String str ;
	public void multi()
	{
		System.out.println("this is in multi1 ");
	}
}
class Multi2 extends Multi1
{
	
	public void instanceVariables()
	{
		str = "You Can Access";
	}
}
class Multi3 extends Multi2
{
	public void instanceVariables()
	{
		str = "you can't acess";
	}
	
	
//	public void multi() {
//		super.multi();
//		System.out.println("this is in multi3");
//	}
}


public class MultiLevel {
	public static void main(String[] args) {
		Multi3 multi3 = new Multi3();
		
		multi3.multi();
		multi3.instanceVariables();
		System.out.println(multi3.str);
		System.out.println(new Multi1().str);
	}
}
