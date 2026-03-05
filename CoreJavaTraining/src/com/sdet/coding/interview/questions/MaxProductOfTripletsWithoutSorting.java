package com.sdet.coding.interview.questions;

public class MaxProductOfTripletsWithoutSorting {

	public static void main(String[] args) {

		int[] input= {7,3,2,5,-10,-20};
		
		int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for(int n:input) {
			if(n>max1) {
				max3=max2;
				max2=max1;
				max1=n;
			}
			else if(n>max2) {
				max3=max2;
				max2=n;
			}
			else if(n>max3) {
				max3=n;
			}
			if(n<min1) {
				min2=min1;
				min1=n;
			}
			else if(n<min2) {
				min2=n;
			}
		}
		int result1=max1*max2*max3;
		int result2=min1*min2*max1;
		int result=Math.max(result1, result2);
		System.out.println("Max product of Triplets: "+result);
	}

}
