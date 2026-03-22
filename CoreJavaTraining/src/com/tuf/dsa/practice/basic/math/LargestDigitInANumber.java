package com.tuf.dsa.practice.basic.math;

public class LargestDigitInANumber {

	public static void main(String[] args) {

		int num =56921;
		int largestDigit=0;
		
		while(num>0) {
			int lastDigit = num%10;
			if(lastDigit>largestDigit) {
				largestDigit=lastDigit;
			}
			num=num/10;
		}
		System.out.println("Largest digit in a given number is: "+ largestDigit);

	}

}
