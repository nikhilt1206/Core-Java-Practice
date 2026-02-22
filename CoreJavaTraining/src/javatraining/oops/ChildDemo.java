package javatraining.oops;

public class ChildDemo extends ParentDemo {

	String name ="Nikhil";
	
	public ChildDemo() {
		super(); //it will call parent class constructor
		System.out.println("Child class constructor");
	}
	
	public void getStringdata() {
		System.out.println(name);//child variable
		System.out.println(super.name);//parent variable
	}
	
	public void getData() {
		super.getData();//parent method
		System.out.println("I am in child class");
	}
	
	
	public static void main(String[] args) {

		ChildDemo cd = new ChildDemo();
		cd.getStringdata();
		cd.getData();

	}

}
