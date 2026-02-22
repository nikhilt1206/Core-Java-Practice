package javatraining.oops;

public class MethodOverloading {

	//Method Overloading - either argument count should be different or argument data type should be different
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.getData(45); //it will call the first method having integer type
		mo.getData("SowjanyaDi");// it will call the second methods having data type as String
		mo.getData(4, 5);//it will call the third method since 2 integer parameters are getting passed

	}

}
