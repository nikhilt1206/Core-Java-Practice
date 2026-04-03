package com.tuf.dsa.practice.basic.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramStringsHashMap {

	public static void main(String[] args) {

		String s = "listen";
		String t = "silent";
		
		if(s.length()!=t.length()) {
			System.out .println("Strings are not anagram");
			return;
		}
		
		Map<Character,Integer> map = new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c:t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)-1);
		}

		for(int value:map.values()) {
			if(value!=0) {
				System.out.println("Not an anagram");
				return;
			}
		}
		System.out.println("Anagram"); 
	}

}
