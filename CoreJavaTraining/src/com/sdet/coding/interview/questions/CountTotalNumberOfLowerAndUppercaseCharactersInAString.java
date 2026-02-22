package com.sdet.coding.interview.questions;

public class CountTotalNumberOfLowerAndUppercaseCharactersInAString {

	public static void main(String[] args) {
		
		String input = "AabBcDd";
		int lowerCaseCount=0;
		int upperCaseCount=0;
		
		char[] dataArray=input.toCharArray();
		for(char data:dataArray) {
			if(Character.isUpperCase(data)) {
			upperCaseCount++;
			}
			else if(Character.isLowerCase(data)) {
				lowerCaseCount++;
			}
		}
		
		System.out.println("Input string : "+input);
		System.out.println("Total Uppercase Characters : "+upperCaseCount);
		System.out.println("Total Lowercase Characters : "+lowerCaseCount);

	}

}
