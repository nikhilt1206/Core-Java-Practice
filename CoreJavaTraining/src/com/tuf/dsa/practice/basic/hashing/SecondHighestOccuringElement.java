package com.tuf.dsa.practice.basic.hashing;

public class SecondHighestOccuringElement {

	public int secondMostFrequentElement(int[] nums) {
		
		int n = nums.length;
		int maxFrequency=0;
		int secMaxFrequency=0;
		int maxElement=-1, secMaxElement=-1;
		
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
			if(currFrequency>maxFrequency) {
				secMaxFrequency=maxFrequency;
				maxFrequency=currFrequency;
				secMaxElement=maxElement;
				maxElement=nums[i];
			}
			else if(currFrequency==maxFrequency) {
				maxElement=Math.min(maxElement,nums[i]);
			}
			else if(currFrequency>secMaxFrequency) {
				secMaxFrequency=currFrequency;
				secMaxElement=nums[i];
			}
			else if(currFrequency==secMaxFrequency) {
				secMaxElement=Math.min(secMaxElement,nums[i]);
			}
		}
		
		return secMaxElement;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,4,5,5,6,7};
		SecondHighestOccuringElement sm = new SecondHighestOccuringElement();
		int result = sm.secondMostFrequentElement(nums);
		System.out.println("The second highest occurring element in the given array is: "+result);
	}

}
