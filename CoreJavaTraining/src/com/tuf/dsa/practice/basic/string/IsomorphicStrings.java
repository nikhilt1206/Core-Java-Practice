package com.tuf.dsa.practice.basic.string;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s = "foo";
		String t = "bar";
		if(s.length()!=t.length()) {
			System.out.println("These string is not isomorphic");
			 return;
		}
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))) {
				System.out.println("These string is not isomorphic");
				return;
			}
		}
		System.out.println("These string is isomorphic");
	}

}
