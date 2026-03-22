package com.tuf.dsa.practice.basic.math;

public class LCM {

	public int LCMOfTwoNumbers(int n1, int n2) {
		int lcm;
		int n = Math.max(n1, n2);
		int i=1;
		while(true) {
			int mul = n*i;
			if(mul%n1==0 && mul%n2==0) {
				lcm=mul;
				break;
			}
			i++;
		}
		return lcm;
		
	}
	public static void main(String[] args) {

		int num1 = 4,num2 = 6;
		LCM lcm = new LCM();
		int result = lcm.LCMOfTwoNumbers(num1, num2);
		System.out.println("LCM of "+num1+" and "+num2+" is:"+result);
	}

}
