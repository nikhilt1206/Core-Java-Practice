package com.tuf.dsa.practice.basic.hashing;

import java.util.HashMap;

public class SecondHighestOccuringElementUsingHashmap {

	public static void main(String[] args) {

		int[] nums = {4,4,5,5,6,7};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int maxFreq=0, secMaxFreq=0;
		int maxEle=-1, secMaxEle=-1;
		
		for(int key : map.keySet()){
			int freq = map.get(key);
			
			if(freq>maxFreq) {
				secMaxFreq=maxFreq;
				secMaxEle=maxEle;
				maxFreq=freq;
				maxEle=key;
			}
			else if(freq==maxFreq) {
				maxEle=Math.min(maxEle, key);
			}
			else if(freq>secMaxFreq) {
				secMaxFreq=freq;
				secMaxEle=key;
			}
			else if(freq==secMaxFreq) {
				secMaxEle=Math.min(secMaxEle, key);
			}
		}
		System.out.println("Second most frequent element: "+secMaxEle);
	}

}
