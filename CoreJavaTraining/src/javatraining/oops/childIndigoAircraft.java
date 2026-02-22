package javatraining.oops;

public class childIndigoAircraft extends ParentAircraft{

	public static void main(String[] args) {
		
		childIndigoAircraft cia = new childIndigoAircraft();
		cia.engineGuidelines();
		cia.safetyGuidelines();
		cia.colorGuidelines();
		
		//You can create object of a class which is marked as abstract class
		//ParentAircraft pa = new ParentAircraft();
		//private is not allowed as access modifier for the methods defined in an abstract class
	}

	@Override
	public void colorGuidelines() {

		System.out.println("White and Blue");
		
	}

}
