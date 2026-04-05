package com.tuf.dsa.practice.basic.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {

	public static void main(String[] args) {

		String s= "tree";
		char[] charArray = s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c:charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((a,b)-> {
			if(!b.getValue().equals(a.getValue())) {
				return b.getValue() - a.getValue();
			}
			else {
				return a.getValue()-b.getValue();
			}
		});
		List<Character> result = new ArrayList<>();
		for(Map.Entry<Character, Integer> entry : list) {
			result.add(entry.getKey());
		}
		System.out.println(result);
	}

}
