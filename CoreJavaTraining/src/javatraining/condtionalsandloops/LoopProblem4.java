package javatraining.condtionalsandloops;

public class LoopProblem4 {

	public static void main(String[] args) {

		/* 3 
		 * 6  9
		 * 12 15 18
		*/
		int k=1;
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k*3);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

}
