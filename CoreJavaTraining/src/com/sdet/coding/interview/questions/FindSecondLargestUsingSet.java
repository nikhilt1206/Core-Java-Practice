package com.sdet.coding.interview.questions;

import java.util.TreeSet;

public class FindSecondLargestUsingSet {

	public static void main(String[] args) {

		String input="a4b2c0d5";
		findSecondLargestUsingSet(input);

	}

	private static void findSecondLargestUsingSet(String input) {

		char data[]=input.toCharArray();
		int num;
		TreeSet<Integer> ts = new TreeSet<Integer>(); //treeset will store the number in sorted order
		for(char character:data) {
			if(Character.isDigit(character)) {
				num = character-'0';
				ts.add(num);
			}
		}
		System.out.println(ts);
		ts.pollLast();//It will remove the last element
		System.out.println("Second largest number: "+ ts.last());
	}

}
