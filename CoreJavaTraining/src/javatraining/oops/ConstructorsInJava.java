package javatraining.oops;

public class ConstructorsInJava {
	
		//Constructor executes a block of code whenever a object is created.
		//Constructor is just like a method but it will not return any values.
		//Name of constructor should be same as the class name (mandatory)
		//To initiate objects or define variable for the program, we use constructors.
	
		public ConstructorsInJava() { //Default Constructor - not accepting any values 
			System.out.println("I am in the constructor");
		}
	
		public void getData() {
			System.out.println("I am in the method");
		}
		
		public ConstructorsInJava(String s) {
			System.out.println(s);
		}
		
		//Parameterized Constructor
		public ConstructorsInJava(int a, int b) {
			System.out.println("I am in the parametrized constructor");
			System.out.println(a+b);
		}
	public static void main(String[] args) {

		//Here we have created and object 'c' -> constructor will be called 
		//if you don't define explicitly any constructor, a default constructor will be called internally.
		ConstructorsInJava c = new ConstructorsInJava();
		
		//Parameterized constructor will be called
		ConstructorsInJava cd = new ConstructorsInJava(2,3);
		ConstructorsInJava s = new ConstructorsInJava("Nikhil");
		

	}

}
