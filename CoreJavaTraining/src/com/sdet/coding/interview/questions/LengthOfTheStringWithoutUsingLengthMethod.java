package com.sdet.coding.interview.questions;

public class LengthOfTheStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		
		//Find the length of the string without using .length method
		//Length of the string = total number of characters 
		
		String data ="Nikhil";
		//System.out.println(data.length());
		
		//Convert string into character array
		char characters[] = data.toCharArray();
		int count =0;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		for(char x : characters) {
			count++;
		}
		System.out.println(count);
		
		
		//Without using character array 
		
		String s = "NikhilTiwari";
		int c =0;
		while(true) {
			
			try {
				s.charAt(c);
				c++;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(c);
				break;
			}
		}
		
	}

}
