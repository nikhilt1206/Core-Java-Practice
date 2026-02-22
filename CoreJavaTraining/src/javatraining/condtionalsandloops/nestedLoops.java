package javatraining.condtionalsandloops;

public class nestedLoops {

	public static void main(String[] args) {

		//Nested loops 
		for(int i=1;i<=4;i++) { //outer loop
			System.out.println("Outer loop started.");
			for(int j=1;j<=4;j++) { //inner loop
				System.out.println("Inner loop.");
			}
			System.out.println("Outer loop ended.");
		}

	}

}
