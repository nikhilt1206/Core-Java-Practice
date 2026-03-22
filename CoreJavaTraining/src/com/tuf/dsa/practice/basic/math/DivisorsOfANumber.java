package com.tuf.dsa.practice.basic.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivisorsOfANumber {

	public int[] divisors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				list.add(i);
				if(i!=n/i) {
					list.add(n/i);
				}
			}
		}
		Collections.sort(list);
		int[] result = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {

		int num = 36;
		DivisorsOfANumber dn = new DivisorsOfANumber();
		int[] div = dn.divisors(num);
		System.out.println("The divisors of "+num+" are: "+Arrays.toString(div));

	}

}
