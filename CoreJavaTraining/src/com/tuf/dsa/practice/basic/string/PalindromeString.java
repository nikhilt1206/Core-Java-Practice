package com.tuf.dsa.practice.basic.string;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		int i = 0;
		int j = s.length() - 1;
		boolean isPalindrome = true;

		while (i < j) {

		    if (!Character.isLetterOrDigit(s.charAt(i))) {
		        i++;
		        continue;
		    }

		    if (!Character.isLetterOrDigit(s.charAt(j))) {
		        j--;
		        continue;
		    }

		    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
		        isPalindrome = false;
		        break;
		    }

		    i++;
		    j--;
		}

		System.out.println(isPalindrome);				
	}
}
