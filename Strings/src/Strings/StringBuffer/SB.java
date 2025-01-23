package Strings.StringBuffer;

public class SB {
	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer();
		//default capacity of sb is 16 if you pass integer value when your instanciating the sb then the capacity will be the value which you have passed to it
		// if you pass any string when you instanciating the object then the capacity = sting(which you have passed).length() + 16(default capacity)
		
		
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		
		StringBuffer sb1 = new StringBuffer(1000);
		
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Pavan");
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
	}
}
