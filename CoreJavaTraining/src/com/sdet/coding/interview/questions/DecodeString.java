package com.sdet.coding.interview.questions;

public class DecodeString {

	public static void main(String[] args) {

		String input = "d3m4t2b0a1";
		StringBuilder sb = new StringBuilder();
		
		//char[] charArray=input.toCharArray();
		for(int i=0;i<input.length();i=i+2) {
			char letter = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i+1));
			for(int j=0;j<count;j++) {
				sb.append(letter);
			}
		}
		System.out.println("Decoded String: "+sb);

	}

}
