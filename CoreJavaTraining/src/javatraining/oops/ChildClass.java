package javatraining.oops;

public class ChildClass extends ParentClass{

	public void engine() {
		System.out.println("New engine code implemented");
	}
	
	public void colour() {
		//Color variable is already defined in the parent class so we can access it in the child class.
		System.out.println(colour);
	}
	
	//Same method is present in parent class as well - child class method will override the parent class method 
	//Both methods have same name, signature, parameter 
	
	public void audioSystem() {
		System.out.println("Child audio system code implemented");
	}
	
	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		cc.colour();
		cc.Brakes();
		cc.Gear();
		cc.audioSystem();

	}

}
