package javatraining.oops;

public class FirstClass {

	static int a =4;
	int b=5;
	//Methods : Blocks in Java class
	
	public void getData() {
		System.out.println("I am inside a method");
		//return "hello";
	}
	
	//objects are instances/references of a class
	
	
	
	public static void main(String[] args) {
		
		FirstClass fn = new FirstClass();
		SecondClass sn = new SecondClass();
		sn.setData();
		fn.getData();
		System.out.println(fn.b);
		System.out.print("hi");
		System.out.println("Hello World");
		System.out.println(a);
		
		
	}

}
