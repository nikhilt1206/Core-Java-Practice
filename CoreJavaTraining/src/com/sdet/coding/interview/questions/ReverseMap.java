package com.sdet.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	public static void main(String[] args) {

		Map<String,Integer> ogMap = new HashMap<String,Integer>();
		ogMap.put("A", 1);
		ogMap.put("B", 2);
		ogMap.put("C", 3);
		
		System.out.println(ogMap);
		
		//After reversing Map should look like - {1=A, 2=B,3=C}
		
		Map<Integer, String> reverseMap = new HashMap<Integer,String>();
		
		//To traverse a map
		for(Map.Entry<String, Integer> data  : ogMap.entrySet()) {
			reverseMap.put(data.getValue(), data.getKey());
		}
		
		System.out.println(reverseMap);

	}

}
