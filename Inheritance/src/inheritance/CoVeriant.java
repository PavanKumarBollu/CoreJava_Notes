package inheritance;

class GrandParent
{
	String level() {
		return "Level1";
	}
}
class Parent extends GrandParent
{
	String level()
	{
		return "level 2";
	}
}

class Me 
{

	public GrandParent myGrandParents()
	{
		return new GrandParent();
	}
}
class Child extends Me
{
	
	public Parent myGrandParents()
	{
		return new Parent();
	}
}

public class CoVeriant {

	public static void main(String[] args) {

		
		System.out.println(new Me().myGrandParents().level());
		System.out.println(new Child().myGrandParents().level());
		
	}

}
