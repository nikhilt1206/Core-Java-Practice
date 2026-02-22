package javatraining.arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {

		//It stores data in more than one dimension (row, column etc) instead of single line.
		
		/* 2 4 5
		 * 3 4 7
		 * */
		
		int a[][]= new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		
		int b[][]= {{2,4,5},{6,7,8}};
		
		//System.out.println(a[1][0]);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		
				
	}

}
