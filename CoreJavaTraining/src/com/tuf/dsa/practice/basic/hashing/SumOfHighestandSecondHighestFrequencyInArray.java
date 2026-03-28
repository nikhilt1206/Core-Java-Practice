package com.tuf.dsa.practice.basic.hashing;

public class SumOfHighestandSecondHighestFrequencyInArray {

	public int sumHighestAndLowestFrequency(int[] nums) {
		int n = nums.length;
		int maxFrequency=0;
		int minFrequency=n;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) continue;
			int currFrequency=0;
			for(int j=i;j<n;j++) {
				if(nums[i]==nums[j]) {
					currFrequency++;
					visited[j]=true;
				}
			}
			maxFrequency = Math.max(maxFrequency, currFrequency);
			minFrequency = Math.min(minFrequency, currFrequency);
		}
		return maxFrequency+minFrequency;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,4,5,5,6};
		SumOfHighestandSecondHighestFrequencyInArray sm = new SumOfHighestandSecondHighestFrequencyInArray();
		int result = sm.sumHighestAndLowestFrequency(nums);
		System.out.println("Sum of highest and lowest frequency is: "+result);
	}

}
