package com.tuf.dsa.practice.basic.hashing;

public class HighestOccurringElementInArray {

	public int mostFrequentElement(int[] nums) {
		int n = nums.length;
		int maxFrequency = 0;
		int maxElement = 0;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) continue;
			int frequency=0;
			for(int j=i;j<n;j++) {
				if(nums[i]==nums[j]) {
					frequency++;
					visited[j]=true;
				}
			}
			if(frequency>maxFrequency) {
				maxFrequency=frequency;
				maxElement=nums[i];
			}
			else if(frequency==maxFrequency) {
				maxElement = Math.min(maxElement, nums[i]);
			}
		}
		return maxElement;
	}
	
	public static void main(String[] args) {

		int[] nums = {1,2,2,3,3,3};
		HighestOccurringElementInArray ob = new HighestOccurringElementInArray();
		int result = ob.mostFrequentElement(nums);
		System.out.println("Highest occuring element in the given array is: "+result);

	}

}
