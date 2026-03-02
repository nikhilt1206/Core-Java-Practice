package com.sdet.coding.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaderProblem {

	public static void main(String[] args) {

		int[] array = {16,17,4,3,5,2};
		
		List<Integer> leaders =  new ArrayList<Integer>();
		int length=array.length;
		int maxRight=array[length-1];
		leaders.add(maxRight);
		for(int i=array.length-2;i>=0;i--) {
			if(array[i]>maxRight) {
				maxRight=array[i];
				leaders.add(maxRight);
			}
		}
		Collections.reverse(leaders);
		System.out.println(leaders);
	}

}
