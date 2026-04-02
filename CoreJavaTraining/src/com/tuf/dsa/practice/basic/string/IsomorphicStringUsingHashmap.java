package com.tuf.dsa.practice.basic.string;

import java.util.HashMap;

public class IsomorphicStringUsingHashmap {

	public static void main(String[] args) {

		String s = "egg";
		String t = "add";

		if (s.length() != t.length()) {
			System.out.println("Strings are not isomorphic");
			return;
		}
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (map1.containsKey(ch1)) {
				if (map1.get(ch1) != ch2) {
					System.out.println("Strings are not isomorphic");
					return;
				}
			} else {
				map1.put(ch1, ch2);
			}
			if (map2.containsKey(ch2)) {
				if(map2.get(ch2)!=ch1) {
					System.out.println("Strings are not isomorphic");
					return;
				}
			}
			else {
				map2.put(ch2, ch1);
			}
		}
		System.out.println("Strings are isomorphic");
	}

}
