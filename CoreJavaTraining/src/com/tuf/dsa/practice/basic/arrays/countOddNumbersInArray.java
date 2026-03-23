package com.tuf.dsa.practice.basic.arrays;

public class countOddNumbersInArray {

	public int countOdd(int arr[], int n) {
		int oddNum = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				oddNum++;
			}
		}
		return oddNum;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = 5;
		countOddNumbersInArray co = new countOddNumbersInArray();
		int result =co.countOdd(arr,n);
		System.out.println("There are "+result+" odd numbers in the given array.");
		

	}

}
