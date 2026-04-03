	package com.tuf.dsa.practice.basic.string;

import java.util.Arrays;

public class AnagramStrings {
	
		public static void main(String[] args) {
	
			String s = "listen";
			String t = "silent";
			
			if(s.length()!=t.length()) {
				System.out .println("Strings are not anagram");
				return;
			}
			
			char[] s1 = s.toCharArray();
			Arrays.sort(s1);
			char[] t1 = t.toCharArray();
			Arrays.sort(t1);
			
			if(Arrays.equals(s1, t1)) {
			    System.out.println("Strings are anagram");
			} else {
			    System.out.println("Strings are not anagram");
			}
		
	
		}
	
	}
