package com.tuf.dsa.practice.basic.arrays;

public class checkArrayIsSorted {

	boolean isSorted(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		int[] arr = {6,7,8,9,10};
		int n =5;
		checkArrayIsSorted is = new checkArrayIsSorted();
		boolean result = is.isSorted(arr, n);
		if(result) {
			System.out.println("The given array is sorted.");
		}
		else {
			System.out.println("The given array is not sorted.");
		}

	}

}
