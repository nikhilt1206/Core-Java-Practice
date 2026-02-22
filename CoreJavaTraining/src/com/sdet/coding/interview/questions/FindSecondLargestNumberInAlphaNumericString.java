package com.sdet.coding.interview.questions;

public class FindSecondLargestNumberInAlphaNumericString {

	public static void main(String[] args) {

		String str = "a0b4c3d2e1";
		findSecondLargest(str);
	}

	private static void findSecondLargest(String str) {
		
		if(str==null||str.isEmpty()) {
			System.out.println("Invalid input string");
			return;
		}
		
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		boolean digitFound=true;
		
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
				digitFound=true;
				int num=c-'0'; //To convert the character to integer format 
				if(num>first) {
					second=first;
					first=num;
				}
				else if(num>second && num<first)
				{
					second=num;
				}
			}
		}
		if(!digitFound) {
			System.out.println("No digits found in the string");
		}
		else if(second==Integer.MIN_VALUE) {
			System.out.println("Second largest number not found");
		}
		else {
		System.out.println("Second Largest number is: "+second);
		}
	}
}
