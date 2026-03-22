package com.tuf.dsa.practice.basic.math;

public class reverseNumber {

	public static void main(String[] args) {
		
		int num=5678;
		int reversedNum=0;
		while(num>0) {
			int lastDigit = num%10;
			reversedNum = (reversedNum*10)+lastDigit;
			num=num/10;
		}
		
		System.out.println("Reversed Number is: "+reversedNum);
		
	}

}
