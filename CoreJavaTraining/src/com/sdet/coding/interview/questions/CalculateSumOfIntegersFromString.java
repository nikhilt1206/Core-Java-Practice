package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class CalculateSumOfIntegersFromString {

	public static void main(String[] args) {

		String input = "This is 1000 and it should be 20 30 50 1050";
		
		String[] words =input.split(" ");
		int totalSum=0;
		for(String word:words) {
			try {
				int number = Integer.parseInt(word);
				totalSum=totalSum+number;
			}
			catch(NumberFormatException e) {
				
			}
		}
		System.out.println("Resilt is: "+totalSum);

	}

}
