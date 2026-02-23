package com.sdet.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWordsInString {

	
	public static void main(String[] args) {

		String str = "Hello my name is Nikhil Nikhil";
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		String[] inputArray = str.split(" ");
		
		for(String s:inputArray) {
			result.put(s, result.getOrDefault(s, 0)+1);
		}
		for(Map.Entry<String, Integer> entry:result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
