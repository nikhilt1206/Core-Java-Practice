package com.sdet.coding.interview.questions;

public class ReverseWordsOfStringUsingStringBuilder {

	public static void main(String[] args) {

		String input = "This is fun";
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word:words) {
			char[] character=word.toCharArray();
			int left=0;
			int right=character.length-1;
			while(left<right) {
				char temp = character[left];
				character[left]=character[right];
				character[right]=temp;
				left++;
				right--;
			}
			result.append(character).append(" ");
		}
		System.out.println("Input string: " + input);
		System.out.println("Reversed string: " + result.toString().trim());

	}

}
