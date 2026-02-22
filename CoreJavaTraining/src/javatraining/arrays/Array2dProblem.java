package javatraining.arrays;

public class Array2dProblem {

	public static void main(String[] args) {

		//Print smallest number in 3x3 matrix
		
		int a[][]= {{2,4,5},{6,9,10},{1,12,15}};
		/*int min =a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
*/
		
		int max=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
