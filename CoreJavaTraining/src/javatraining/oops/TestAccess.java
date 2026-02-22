package javatraining.oops;

class Parent{
	
	public int publicVar=10;
	protected int protectedVar=20;
	private int privateVar=30;
	
	public void showValues() {
		System.out.println("Private variable inside class: "+privateVar);
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("Public variable inside class: "+publicVar);
		System.out.println("Protected variable inside class: "+protectedVar);
		//System.out.println("Private variable inside class: "+privateVar); privatVar is not accessible here
	}
}

public class TestAccess {

	public static void main(String[] args) {

		Parent p = new Parent();
		System.out.println("Public: "+p.publicVar);
		
		//System.out.println("Private: "+p.privateVar); not accessible
		System.out.println("Protected: "+p.protectedVar);
		
		Child c = new Child();
		c.display();
		p.showValues();
	}
}
