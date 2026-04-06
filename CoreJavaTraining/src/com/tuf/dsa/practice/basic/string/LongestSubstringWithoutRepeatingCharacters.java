package com.tuf.dsa.practice.basic.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s = "abcdabcbb";
		
		int left=0;
		int maxLength=0;
		Set<Character> set = new HashSet<>();
		for(int right=0;right<s.length();right++) {
			char ch = s.charAt(right);
			while(set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			maxLength = Math.max(maxLength, right-left+1);
		}
		System.out.println(maxLength);
	}

}
