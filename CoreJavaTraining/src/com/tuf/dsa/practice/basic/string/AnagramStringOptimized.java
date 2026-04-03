package com.tuf.dsa.practice.basic.string;

public class AnagramStringOptimized {

	public static void main(String[] args) {

		String s = "listen";
		String t = "silent";
		
		if(s.length()!=t.length()) {
			System.out .println("Strings are not anagram");
			return;
		}
		
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<t.length();i++) {
			freq[t.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) {
				System.out.println("Not an anagram");
				return;
			}
		}
		System.out.println("String are anagram");
	}

}
