package com.sdet.coding.interview.questions;

public class CountTotalNumberOfCharactersInString {

	public static void main(String[] args) {

		String input = " Hie ";
		int count = countValidCharacters(input);
		System.out.println("Count is : " + count);
	}
	public static int countValidCharacters(String input) {
		// Edge Case 1: null input
		if (input == null) {
			return 0;
		}
		// Edge Case 2: string length less than 3
		// Because we need one char before and one after
		if (input.length() < 3) {
			return 0;
		}
		int count = 0;

		char[] charArray = input.toCharArray();

		for (int i = 1; i < charArray.length - 1; i++) {

			if (!Character.isWhitespace(charArray[i]) && !Character.isWhitespace(charArray[i - 1])
					&& !Character.isWhitespace(charArray[i + 1])) {
				count++;
			}
		}
		return count;
	}
}
