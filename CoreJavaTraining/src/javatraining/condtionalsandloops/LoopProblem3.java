package javatraining.condtionalsandloops;

public class LoopProblem3 {

	public static void main(String[] args) {

		/*1
		 *1 2
		 *1 2 3
		 *1 2 3 4
	    */
		//int k=1;
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");
		}

	}

}
