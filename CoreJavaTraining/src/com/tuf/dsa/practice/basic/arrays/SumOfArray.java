package com.tuf.dsa.practice.basic.arrays;

public class SumOfArray {

	public int sum(int arr[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i]; 
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int n = 5;
		SumOfArray sm = new SumOfArray();
		int result = sm.sum(array, n);
		System.out.println("The sum of array elements: "+ result);
	}
}
