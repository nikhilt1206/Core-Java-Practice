package com.tuf.dsa.practice;

public class PerfectNumber {

	public static void main(String[] args) {

		int num=28;
		int sum=0;
		for(int i=1;i<num-1;i++) {
			if(num%i==0) {
				sum = sum +i;
			}
		}
		if(sum==num) {
			System.out.println(num +" number is a perfect number.");
		}
		else {
			System.out.println(num +" number is not a perfect number.");
		}
		
	}

}
