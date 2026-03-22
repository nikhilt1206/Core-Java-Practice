package com.tuf.dsa.practice.basic.math;

public class PrimeNumberTillN {

	public boolean isPrime(int num) {
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
		
	}
	public  int primeUpToN(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {

		int n=5;
		PrimeNumberTillN pn = new PrimeNumberTillN();
		int result = pn.primeUpToN(n);
		System.out.println("The count of primes till "+ n + " is: "+result);
	}

}
