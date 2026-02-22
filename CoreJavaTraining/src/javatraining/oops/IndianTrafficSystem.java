package javatraining.oops;

public class IndianTrafficSystem implements CentralTrafficSystem,ContinentalTrafficSystem {

	public static void main(String[] args) {

		// Interface will have methods but not body
		// Interface will have only method declaration not their implementation
		// (definition)
		// Classes should define and implement methods present in the interface
		//One class can define more than one interface
		CentralTrafficSystem its = new IndianTrafficSystem();
		its.redStop();
		its.waitYellow();
		its.goGreeen();
		IndianTrafficSystem it = new IndianTrafficSystem();
		it.walkOnSignal();
		ContinentalTrafficSystem cts = new IndianTrafficSystem();
		cts.TrainSymbol();
		
		
	}
	
	public void walkOnSignal() {
		System.out.println("Walking");
	}

	@Override
	public void goGreeen() {
		System.out.println("goGreen Implemetation");

	}

	@Override
	public void redStop() {
		System.out.println("redStop Implemetation");

	}

	@Override
	public void waitYellow() {
		System.out.println("waitYellow Implemetation");

	}


	@Override
	public void TrainSymbol() {
		System.out.println("Stop! Train is coming!!");
		
	}

}
