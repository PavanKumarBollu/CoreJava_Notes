package Strings;

public class StringMethodsTesting {
	
	public static void main(String[] args) {
		String s = new String("Pavan Kumar");
		
		
		StringMethods sm = new StringMethods();
		System.out.println(sm.toUpperCase(s));
		
		System.out.println(sm.toLowerCase(s));
		
		System.out.println(sm.eqauls("Pavan", "PAVAN"));
		System.out.println(sm.eqaulIgnoreCase("Pavan Kumar", "Pavan Kumar"));
		
//		System.out.println(sm.replace(" P a v a n K u m a r ", 'a', ' '));
		
		
		//1
		
		System.out.println(s.charAt(0));
		
		//2 
		
		System.out.println(s.concat("Kumar"));
		
		//3 
		
		System.out.println(s.equals("Pavan"));
		
		//4
		
		System.out.println(s.equalsIgnoreCase("PAVAN"));
		
		//5
		System.out.println(s.length());
		
		//6
		
		System.out.println(s.replace('a', 'A'));
		
		//7
		System.out.println(s.toUpperCase());
		
		//8 
		System.out.println(s.toLowerCase());
		
		//9
		
		System.out.println(s.substring(2));
		
		
		//10
		
		System.out.println(s.substring(2,4));
		
		//11
		System.out.println(s.indexOf('P'));
		
		//12
		
		System.out.println(s.lastIndexOf('a'));
		
		
		
		
		
	}
	
}
