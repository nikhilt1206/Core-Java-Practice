package com.sdet.coding.interview.questions;

import java.util.Arrays;

public class ReverseFirstWordOfTheString {

	public static void main(String[] args) {

	String input = "Hello world from Sowjanya!!";
	reverseFirstWord(input);

	}

	private static void reverseFirstWord(String input) {
		if(input==null||input.isEmpty()) {
			System.out.println("Cannot reverse the string");
		}
		else {
			String words[] = input.split(" ",2); //split the input string into 2 halves "Hello" and "world from Sowjanya!!"
			char[] charArray =words[0].toCharArray();
			int left=0;
			int right = charArray.length-1;
			
			System.out.println(Arrays.toString(charArray));
			while(left<right) {
				char temp=charArray[left];
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(charArray));
			String reversedFirstWord = new String(charArray);
			System.out.println("Original String: "+input);
			System.out.println("Reversed String: "+reversedFirstWord +(words.length > 1 ? " " + words[1] : ""));
		}
		
		
	}

}
