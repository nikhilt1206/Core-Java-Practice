package com.tuf.dsa.practice;

public class CheckArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int original = num;
		
		int count = 0;
		int temp = num;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}

		int sum = 0;
		while(num>0) {
			int lastDigit = num%10;
			sum += (int) Math.pow(lastDigit,count);
			num=num/10;
		}
		if(sum==original) {
			System.out.println(original + " is an Armstrong number.");
		}
		else {
			System.out.println(original + " is not an Armstrong number.");
		}
	}

}
