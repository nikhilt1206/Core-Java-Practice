package javatraining.collectionsjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

	public static void main(String[] args) {

		int[] array = {4,5,5,5,4,6,6,9,4};
		//output should per  4-3 times, 5-3 times, 6-2 times, 9-1 times
		
		//Using EMPTY ARRAY LIST
		//ArrayList<Integer> al = new ArrayList<Integer>();
//		for(int i=0;i<array.length;i++) {
//			int k=0;
//			if(!al.contains(array[i])) { 
//				al.add(array[i]);
//				k++;
//				for(int j=i+1;j<array.length;j++) {
//					if(array[i]==array[j]) {
//						k++;
//					}
//				}
//				System.out.println(array[i]+ " " +k); 
//			}
//
//		}
		
		//Using Hashmap 
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int num:array) {
			if(mp.containsKey(num)) {
				mp.put(num, mp.get(num)+1);
			}
			else {
				mp.put(num, 1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue()+ " times");
		}

	}

}
