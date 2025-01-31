//when Ever You create custom annotations you need to specity two things
// 1. Target --> To whom you want to apply this annotaion like classlevel or interface level or methodLevel or Multiple places ..etc
// 2. ReTentionPolocy--> to upto what level you want this power of the annotaion should be there like compiler level or jvm level or browser level...etc

import java.lang.Annotation;



//@Target(ElementType.TYPE)//applicable at class level
//@Retention(RetentionPolicy.RUNTIME)//keeps the annotaion at the jvm level
@interface Cricket
{
	//this is a annotation not interface

	/*	providing the default values while createing  
		String country()  default "Ind";
		String ipl() default "MI"; 
	*/

	/*	providing value later by saying @Cricket(country = "IND", ipl ="MI")
		String country();
		String ipl();
	*/
}

//@Cricket(country = "IND" , ipl = "MI") // providing the default values if not there
@Cricket // directly saying the annotation on the Class
class Player
{
	private int runs;
	private String name;
	public Player(int runs, String name)
	{
		this.runs = runs;
		this.name = name;
	}
	public void setRuns(int runs){	this.runs = runs;	}
	public void setName(String name){ this.name = name ; }
	public int getRuns(){ return this.runs; }
	public String getName(){return this.name; }
}


class UserDAnno
{
	public static void main(String[] args) 
	{
		Player player = new Player(5000, "Rohit");

		System.out.println(" PlayerName : " + player.getName());
		System.out.println("Player Runs : " + player.getRuns());
		System.out.println(" ");

		Class playerClass = player.getClass();
		Annotaion an = playerClass.getAnnotation(Cricket.getClass());

		Cricket c = (Cricket) an;
		System.out.println("Player country :  " + c.country());
		System.out.println("Player IPL	: " + c.ipl());

		


	}
}
