package com.sdet.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulation {

	public static void main(String[] args) {
		
		String input ="a1b2c3"; //output :a3b2c1
		
		List<Character> list = new ArrayList<>();
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				list.add(c);
			}
		}
		int index=list.size()-1;
		
		StringBuilder sb = new StringBuilder();
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(list.get(index));
				index--;
			}
			else {
				sb.append(c);
			}
		}
		System.out.println("Original String: "+input);
		System.out.println("Updated String: "+sb);
	}

}
