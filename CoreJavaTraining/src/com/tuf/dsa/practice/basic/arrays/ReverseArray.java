package com.tuf.dsa.practice.basic.arrays;

import java.util.Arrays;

public class ReverseArray {

	public int[] reverseArray(int[] arr,int n) {
		int i=0;
		int j=n-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int n = 5;
		ReverseArray ra = new ReverseArray();
		int[] result = ra.reverseArray(arr, n);
		System.out.println("Reversed array: "+Arrays.toString(result));
	}

}
