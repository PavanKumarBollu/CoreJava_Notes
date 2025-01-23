package Strings;

public class StringsDemo {
	public static void main(String[] args) {
		String str = new String("this will Create Two Object 1 in Heap Memory and 1 in SCP and str will Point to the object which is in the Heap Area");
		
		System.out.println(str);
		
		
		String name = "Pavan"; //1 object in scp
		
		String name1 = new String("Pavan"); //2 objects 1 in heap and 1 in scp but scp object already exist and name is pointing to the SCP Object;
		
		System.out.println(name == name1);
		
		System.out.println();
		
		name1 = name ;
		
		
		
		System.out.println(name == name1);//both are pointing to the string in scp
		
		//to upperCase
		
		
		String emptyStr = " ";
		for(int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i)>= 'A' && name.charAt(i) <= 'Z') {
				emptyStr+=name.charAt(i);
			}else {
			emptyStr +=(char)(name.charAt(i)-32);
			
			}
		}
		System.out.println(emptyStr);
		System.out.println(name.length());
		
		
		
	}
}
