package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class CombinationProblem {

	public static void main(String[] args) {

		int[] array = {4,5,10,3,7};
		
		//Calculate the total sum of the array 
		int sum=0;
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("Total Sum: "+sum);
		int totalElements=array.length;
		double average = ((double)sum)/totalElements;
		System.out.println("Average is: "+average);
		
		//Lagest and the second largest element of array 
		int largest=Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int data:array)
		{
			if(data>largest) {
				secondLargest=largest;
				largest=data;
			}
			if(data>secondLargest && data!=largest) {
				secondLargest=data;
			}
		}
		System.out.println("Largest element: "+largest+ " and Second Largest element: "+secondLargest);
		
		//Reverse first half of the array and second half only
		//int left=0;
		//for seocnd half left will be mid and right will be array.length-1;
//		int mid = array.length/2;
//		int right =mid-1;
//		System.out.println("Original Array: "+Arrays.toString(array));
//		while(left<right) {
//			int temp=array[left];
//			array[left]=array[right];
//			array[right]=temp;
//			left++;
//			right--;
//		}
//		System.out.println("Reversed first half of array: "+Arrays.toString(array));
		
		//Reversed second half of the array
		//for seocnd half left will be mid and right will be array.length-1;

		int mid = array.length/2;
		int left=mid;
		int right =array.length-1;
		System.out.println("Original Array: "+Arrays.toString(array));
		while(left<right) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
		}
		System.out.println("Reversed Second half of array: "+Arrays.toString(array));
		
	}

}
