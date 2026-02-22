package javatraining.exceptionsinjava;

public class ExceptionsInJava {
	
	
	public static void main(String[] args) {

		int b=7;
		int c = 0;
		
		//one try block can be followed by multiple catch blocks
		//catch should be an immediate block after try block
	
	    //if u already suspect that given statement will throw an error then you can use try-catch block to pass the 
		//script and catch error by putting proper debug message.
		
		try {
			//int k=b/c;
			int[] arr = new int[5];
			System.out.println(arr[7]); 
		}
		catch(ArithmeticException et) { //this catch block will catch only exceptions related to arithmetic problems
			System.out.println("I catched the arithmentic exception");
		}
		catch(IndexOutOfBoundsException ide) {
			System.out.println("I catched the index out of bound exception");
		}
		
		catch(Exception e) { //Generic exception - support all exceptions
			System.out.println("I catched the error/exception");
		}
		//we can use try-finally without catch block 
		finally{ //this block is executed irrespective of exception thrown or not 
			System.out.println("Cookies Deleted!");
		}
	}

}
