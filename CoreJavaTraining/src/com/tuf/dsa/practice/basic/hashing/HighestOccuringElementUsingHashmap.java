package com.tuf.dsa.practice.basic.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringElementUsingHashmap {

	public static void main(String[] args) {

		int[] nums= {1,2,2,3,3,3};
		Map<Integer, Integer> map = new HashMap<>();
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int maxFreq = 0;
		int result = Integer.MAX_VALUE;
		
		for(int key: map.keySet()) {
			int freq=map.get(key);
			if(freq>maxFreq) {
				maxFreq=freq;
				result=key;
			}
			else if(freq==maxFreq && key<result) {
				result=key;
			}
		}
		System.out.println("Highest occuring element in the given array is: "+result);
	}

}
