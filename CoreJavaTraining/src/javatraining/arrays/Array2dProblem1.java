package javatraining.arrays;

public class Array2dProblem1 {

	public static void main(String[] args) {

		
		//First find the minimum in a 2d matrix, then print the maximum value from its adjacent column.”
		
		int a[][]= {{12,4,8},{7,9,2},{5,15,6}};
		int min =a[0][0];
		int minRowIndex=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]<min) {
					min=a[i][j];
					minRowIndex=j;
				}
			}
		}
		int max=a[0][minRowIndex];
		int k=0;
		while(k<a[0].length) {
			if(a[k][minRowIndex]>max) {
				max = a[k][minRowIndex];
			}
			k++;
		}
		System.out.println(max);
	}

}
