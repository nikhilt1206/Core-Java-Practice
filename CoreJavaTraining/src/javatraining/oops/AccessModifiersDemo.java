package javatraining.oops;

public class AccessModifiersDemo {

	void abc() { //within the same package this method can be accessed by creating object of this class 
		//But since no access specifier provided so it won't be accessible outside this package
		//Access modifiers - public, private, protected, default
		//default : access method anywhere in the package
		//if we don't specific the access modifier - default 
		//applies to variables as well 
		//public - method/variable - access across all the packages 
		//private - method/variable - cannot be accessed outside the class of same package as well
		//protected - method/variable - we can access those in sub classes only (other packages)
		
	}
	 
	
	public static void main(String[] args) {
		

	}

}
