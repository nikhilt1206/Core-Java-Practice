package com.tuf.dsa.practice.basic.math;

public class GCD {

	public int greatestCommonDivisor(int num1, int num2) {
		int gcd=1;
		for(int i=2;i<=Math.min(num1, num2);i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {

		int n1=6,n2=12;
		GCD res = new GCD();
		int gcdOfTwoNumber = res.greatestCommonDivisor(n1, n2);
		System.out.println("GCD of "+n1+" and "+n2+ " is : "+gcdOfTwoNumber);

	}

}
