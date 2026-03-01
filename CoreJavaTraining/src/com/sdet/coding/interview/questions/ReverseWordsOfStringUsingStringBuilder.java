package com.sdet.coding.interview.questions;

public class ReverseWordsOfStringUsingStringBuilder {

	public static void main(String[] args) {

		String input = "This is fun";
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word:words) {
			StringBuilder reversedWord = new StringBuilder(word);
			result.append(reversedWord.reverse().append(" "));
			} 
		System.out.println("Input string: " + input);
		System.out.println("Reversed string: " + result.toString().trim());

	}

}
