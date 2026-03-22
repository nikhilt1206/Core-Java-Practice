package com.tuf.dsa.practice.basic.math;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int num = 6;
		//Factorial of 0! is always 1
		
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of a given number is: "+factorial);

	}

}
