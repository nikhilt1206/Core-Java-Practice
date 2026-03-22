package com.tuf.dsa.practice.basic.math;

class Solution1{

	public int countDigit(int n) {
	
		if(n==0) {
			return 1;
		}
		int count=0;
		while(n>0) {
			count =count +1;
			n=n/10;
		}
		return count;
	}
	
}

public class CountAllDigitsOfANumber {

	public static void main(String[] args) {

		 int n =123456;
		 Solution1 s = new Solution1();
		 int ans = s.countDigit(n);
		 System.out.println("The count of digits in the given number is: "+ans);
		 

	}

}
