package javatraining.oops;

public class ChildClassSuperDemo extends ParentClassSuperDemo {

	
	String name ="Nikhil";
	
	//Constructor 
	public ChildClassSuperDemo() {
		super();//this should always be the first line if u want to call parent constructor from child constructor
		System.out.println("Child Class constructor");
	}
	
	public void getStringData() {
		System.out.println(name); //child class variable 
		System.out.println(super.name); //This refers to parent class variable
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in a child class");
	}
	
	public static void main(String[] args) {

		ChildClassSuperDemo cd =  new ChildClassSuperDemo();
		cd.getStringData();
		cd.getData();
	}

}
