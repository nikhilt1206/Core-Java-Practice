package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class MaxProductOfTriplets {

	public static void main(String[] args) {

		int[] a = {-10,-3,5,6,-20};
		
		Arrays.sort(a);
		int n=a.length;
		if(n<3) {
			System.err.println("Minimum number of elements that should be there in the array should be 3.");
		}
		
		System.out.println(Arrays.toString(a));
		
		int result1 = a[n-1]*a[n-2]*a[n-3];
		//System.out.println(result1);
		
		int result2 = a[0]*a[1]*a[n-1];
		//System.out.println(result2);
		
		int result = Math.max(result1, result2);
		System.out.println("Maximum product: "+ result);
		
	}

}
