package javatraining.collectionsjava;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {

		// Stores data in <Key,Value> pairs
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(2, "good morning");
		hm.put(3, "good evening");
		System.out.println(hm.get(2));
		System.out.println(hm.get(24));
		hm.remove(0);
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("goodbye"));

		// Entry Set - Returns a set of Key-value pairs from a Hashmap(Map)
		// To print each element in the set - Map.Entry object
		// To iternate through both key and value together - Efficient traversal of
		// Hashmap

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());

		}
	}
}
