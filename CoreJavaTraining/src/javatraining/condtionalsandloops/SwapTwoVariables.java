package javatraining.condtionalsandloops;

public class SwapTwoVariables {

	public static void main(String[] args) {

		int a=4;
		int b=7;
//		int temp;
		System.out.println("Before swapping a: "+ a + " b: " +b);
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping a: "+ a + " b: " +b);
		
		//Swap without using temporary variable 
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a: "+ a + " b: " +b);
	}

}
