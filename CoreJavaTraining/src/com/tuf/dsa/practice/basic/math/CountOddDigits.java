package com.tuf.dsa.practice.basic.math;

class Solution {

	public int countOddDigits(int n) {

		int oddCount = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit % 2 != 0) {
				oddCount = oddCount + 1;
			}
			n = n / 10;
		}
		return oddCount;
	}
}

public class CountOddDigits {

	public static void main(String[] args) {

		int n = 123456;
		Solution s = new Solution();
		int ans = s.countOddDigits(n);
		System.out.println("Total count of odd digits in a given number is: " + ans);
	}
}
