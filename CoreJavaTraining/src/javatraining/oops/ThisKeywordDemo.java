package javatraining.oops;

public class ThisKeywordDemo {

	int a=2;//global variable
	
	public void getData() {
		int a=3;//local variable
		int b=a+this.a;
		System.out.println(a);
		//This keyword refer to the current class object - object scope lies in class level
		System.out.println(this.a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {

		ThisKeywordDemo td = new ThisKeywordDemo();
		td.getData();

	}

}
