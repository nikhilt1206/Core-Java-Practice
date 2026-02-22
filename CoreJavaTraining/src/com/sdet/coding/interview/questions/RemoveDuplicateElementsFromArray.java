package com.sdet.coding.interview.questions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {

		int a[]= {20,10,30,20,10,40};
		//output should be 20 10 30 40 
		
		Set<Integer> dataSet = new LinkedHashSet<>();
		for(int data : a) {
			dataSet.add(data);
		}
		System.out.println(dataSet);// This is an Integer object

		//Convert the LinkedHashSet into an array using - Streams 
		
		int result[] = dataSet.stream().mapToInt(Integer::intValue).toArray(); //Converting integer object to primitive int 
		System.out.println(Arrays.toString(result)); //This is an Integer array 
		
		//Streams in Java are used to process collections of data in a functional and efficient way without explicitly using loops.
		//Simpler code (Streams : Java 8 Feature)
		int resultUsingStreams[]= Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(resultUsingStreams));
		
	}

}
