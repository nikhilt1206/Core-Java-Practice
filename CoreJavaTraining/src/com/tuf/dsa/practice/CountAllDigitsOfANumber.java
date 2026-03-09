package com.tuf.dsa.practice;

class Solution{

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
		 Solution s = new Solution();
		 int ans = s.countDigit(n);
		 System.out.println("The count of digits in the given number is: "+ans);
		 

	}

}
