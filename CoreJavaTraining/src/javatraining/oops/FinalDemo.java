package javatraining.oops;

//public class FinalDemo { //Final Class - class cannot be extended if it is declared as final 
//cannot be used as parent/base class
	public class FinalDemo { 
	
	final void getData() { //if method is final then it cannot be overriden 
		
	}
	
	public static void main(String[] args) {

		final int i=4; //Constant variable - value cannot be changed
		//int i=5; ERROR 
		System.out.println(i);
		

	}

}

	