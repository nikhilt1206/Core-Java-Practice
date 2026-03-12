package com.tuf.dsa.practice;

public class PalindromeNumer {

	public static void main(String[] args) {

		int num = 151;
		int copyNum = num; //we are coping orinal number for checking modified number
		int revNumber=0;
		
	
		while(num>0) {
			int lastDigit = num%10;
			revNumber = (revNumber*10)+lastDigit;
			num=num/10;
		}
		if(revNumber==copyNum) {
			System.out.println("True. Given number is Palindrome number.");
		}
		else {
			System.out.println("false. Not a Palindrome number.");
		}

	}

}
