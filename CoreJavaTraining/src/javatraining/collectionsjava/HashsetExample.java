package javatraining.collectionsjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		//Hashset, Treeset and LinkedHashset implements Set interface
		//Set interfaces does not accept duplicate values
		//There is no guarantee that elements stored in sequential order (Random order)
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Bengaluru");
		hs.add("Varanasi");
		hs.add("Kurnool");
		hs.add("Prayagraj");
		hs.add("Varanasi");//No duplicate values - it won't give error but it won't store it 
		hs.add("Jaipur");
		hs.add("Hyderabad");
		hs.add("Chennai");
		System.out.println(hs); //stored in random order
		//hs.remove("Bengaluru");
		//System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//To iterate each string in the hashset, iterator interface will help is to traverse each object present in the set
		Iterator<String> it = hs.iterator(); //it will create an object for set and it will point to the set 
		//System.out.println(it.next());//points to first object in the set - Kurnool
		//System.out.println(it.next());//points to second object in the set - Bengaluru
		
		//if we have many objects in the set then we can use the loop with iterator to traverse the set 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
