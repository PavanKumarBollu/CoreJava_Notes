package Interface.namingconflicts;


//two interfaces can contain the variables with same name there may be the chances are there for the 
// variable naming conflict but by using the interface names we can avoid this problem

interface INine
{
	public static final int ZZ = 9;
}
interface ITen
{
	public static final int ZZ = 10;
}


public class VariableNameConflict implements INine ,ITen {
 
	public static void main(String[] args) {
//		System.out.println(ZZ);//ambiguous
		System.out.println("INine value : " + INine.ZZ);
		System.out.println("ITen value : " + ITen.ZZ);
	}
}
