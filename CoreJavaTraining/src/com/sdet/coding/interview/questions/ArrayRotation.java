package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		//Left rotation   
		int[] a = { 1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		k = k % a.length;
		a= reverse(a, 0, k - 1); //reverse first k elements
		//reverse remaining elements of the array
		a=reverse(a,k,a.length-1);
		//reverse whole array
		a=reverse(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static int[] reverse(int[] a, int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		return a;
	}

}
