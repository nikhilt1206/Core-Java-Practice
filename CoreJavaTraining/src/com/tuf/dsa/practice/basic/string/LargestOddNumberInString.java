package com.tuf.dsa.practice.basic.string;

public class LargestOddNumberInString {

	public static void main(String[] args) {

		String s = "0214638";
		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			if ((s.charAt(i) - '0') % 2 != 0) {
				result = s.substring(0, i + 1);
				break;
			}
		}

		if (!result.isEmpty()) {
			result = result.replaceFirst("^0+", "");
		}
		System.out.println("Largest odd number in string: " + result);

	}
}
