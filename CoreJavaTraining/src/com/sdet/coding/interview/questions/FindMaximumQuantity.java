package com.sdet.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumQuantity {

	public static void main(String[] args) {

		String a[] = {"xyz 9","abc 20","xyz 26"};
		HashMap<String, Integer> hmap = new HashMap<String,Integer>();
		for(String s : a) {
			String[] data = s.split(" ");
			String name = data[0];
			int quantity = Integer.parseInt(data[1]);
			hmap.put(name, hmap.getOrDefault(name, 0)+quantity);
		}
		String product ="";
		int maxQuantity=0;
		
		for(Map.Entry<String, Integer> entrySet : hmap.entrySet())
		{
			if(entrySet.getValue()>maxQuantity) {
				maxQuantity=entrySet.getValue();
				product=entrySet.getKey();
			}
		}
		System.out.println(product+" " +maxQuantity);

	}

}
