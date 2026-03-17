package com.tuf.dsa.practice;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=29;
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(num);
		if(result) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");
		}
	}
	
	boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
