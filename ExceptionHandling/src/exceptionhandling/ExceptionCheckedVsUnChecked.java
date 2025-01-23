package exceptionhandling;


//unchedException ==> compiler will not force us to handle the exception it will not checked during the compile time
	// RunTimeException and it child classes, Error and its child Classes are unchecked Exceptions
	// remaining all are checked Exception
// checkedException ==> compiler will force us to handle the exception, if your not handling the Exception the the code wont compile
	//IOException, SQLException, FileNotFoundException,





public class ExceptionCheckedVsUnChecked {

	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("Before Sleeping");
		Thread.sleep(5000);
		System.out.println("After Sleeping");
		
	
	}

}
