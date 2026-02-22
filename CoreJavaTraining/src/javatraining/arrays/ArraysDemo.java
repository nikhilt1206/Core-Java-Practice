package javatraining.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		//A container which stores multiple values of same data type
		
		int a[]= new int[5]; //Array declaration 
		 a[0]=2;
		 a[1]=6;
		 a[2]=1;
		 a[3]=9;
		 a[4]=12;
		 
		 //Retrieving array elements 
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println("");
		
		 //Array declaration using array literals
		 
		 int c[]= {1,2,4,5,7,9};
		 for(int j=0;j<c.length;j++) {
			 System.out.print(c[j]+" ");
		 }

	}

}
