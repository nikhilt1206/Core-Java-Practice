package javatraining.oops;

public class StaticVar {
	
	//Here variables declared are instance/object variables | Scope: Object to object 
	String name;
	String address;
	
	//class variable 
	static String city; //this variable copy is shared by all the objects - Saving memory | Scope: class not object
	static int i;
	
	static { //Used to initialize static variables 
		city="Bnegaluru";
		i=0;
	}
	StaticVar(String name, String address){ //Here variables are local variables | Scope: inside the block only
		
		this.name=name; //Here this.name represents the current object instance
		this.address=address; 
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+" "+city);
	}

	public static void getCity()//Static method/class methods - it will only accept static variables
	{
		System.out.println(city); //Should always use static variables
	}
	public static void main(String[] args) {

		StaticVar obj = new StaticVar("Nikhil","Bellandur");
		StaticVar obj1 = new StaticVar("Sowjanaya","Kundanhalli");
		StaticVar obj2 = new StaticVar("Hayaan","KundanhalliGate");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity(); //No need to create object to call this static method, they belong to classes so can call with class name
		StaticVar.i=4; //Allowed - static
		obj.address="xyz"; //Allowed - non-static
	}

}
