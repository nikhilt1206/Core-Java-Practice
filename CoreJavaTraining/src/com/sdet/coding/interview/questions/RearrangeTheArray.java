package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class RearrangeTheArray {

	public static void main(String[] args) {

		int array[] = {1,0,2,0,4,3,5};
		int left=0;
		int right=array.length-1;
		System.out.println("Initial array: "+Arrays.toString(array));
		while(left<right) {
			while(left<right && array[left]%2==0) {
				left++;
			}
			while(left<right && array[right]%2!=0) {
				right--;
			}
			if(left<right) {
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--; 
			}
			//System.out.println(Arrays.toString(array));
		}
		int evenEnd =0;
		while(evenEnd<array.length && array[evenEnd]%2==0) {
			evenEnd++;
		}
		Arrays.sort(array,0,evenEnd);
		Arrays.sort(array,evenEnd,array.length);
		System.out.println("Rearranged array: "+Arrays.toString(array));
	}

}
