package finalKeyWord;


final class Final
{
	void disp()
	{
		System.out.println("this is a final class");
	}
}
class ChildFinal extends Final
{
	//final classWont participate in the inheritance which means it won't allow to extend
}

public class FinalClass {
	
	public static void main(String[] args) {
		Final f = new Final();
		f.disp();
	}
}
