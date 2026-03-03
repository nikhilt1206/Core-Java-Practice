package com.sdet.coding.interview.questions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String input = "aabbccddaab";
		char[] characterArray=input.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for(char c:characterArray) {
			if(set.add(c)) {
				sb.append(c);
			}
		}
		System.out.println("Non-Duplicate String: "+sb);
		
		//USING STREAM - JAVA 8
		String inputStr = "abbccddeea";
		String result = inputStr.chars().distinct().mapToObj(c->String.valueOf((char)c)).reduce("", (a,b)->a+b);
		System.out.println(result);

	}
}



	