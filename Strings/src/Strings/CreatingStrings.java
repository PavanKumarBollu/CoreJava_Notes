package Strings;

public class CreatingStrings {
	public static void main(String[] args) {
//		there are two main ways to create a String in Java 
		// 1. Using new keyword
		// 2. Directly Assigning value to the variable
		
		//1.using new keyword
		String str = new String("Pavan");
		//this will create two objects 1 in Heap area another in 1 in scp
		// str will point the object in the Heap area and scp will contains the Pavan String
		//garbage collecter will not remove the objects in the scp the only way which 
		// will deletes the objects in the scp is closing the jvm which means closing the ide 
		// will deletes the objects in the heap area 
		
		
		
		// 2. directly assigning the values to the variables 
		
		String str2 = "Pavan";
		
		// str2 will go scp and searches for the String object called PavanKumar
		// if the object is already exits in scp then it will starts pointing to that object
		// otherwise it will creates new object in scp and starts pointing to that object
		
		
		System.out.println("Heap area String Object : " +  str);
		System.out.println("SCP Area String Object : " + str2);
		
	}
}
