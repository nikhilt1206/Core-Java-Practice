package com.tuf.dsa.practice.basic.string;

public class RotateStringOptimized {

	public static void main(String[] args) {

		String s = "abcde";
		String goal = "cdeab";

		if ((s + s).contains(goal)) {
			System.out.println("String will match to goal string after rotation");
		} 
		else {
			System.out.println("String will NOT match to goal string after any rotation");
		}
	}

}
