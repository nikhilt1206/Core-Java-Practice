package com.tuf.dsa.practice.basic.hashing;

import java.util.HashMap;

public class SumOfHighestLowestFrequenctUsingHashmap {

	public static void main(String[] args) {

		int[] nums = {1,1,2,3,3,3};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int maxFrequency=0;
		int minFrequency=Integer.MAX_VALUE;
		
		for(int freq:map.values()) {
			maxFrequency=Math.max(maxFrequency, freq);
			minFrequency=Math.min(minFrequency, freq);
		}
		System.out.println("Sum of highest and lowest frequency is: "+(maxFrequency+minFrequency));

	}

}
