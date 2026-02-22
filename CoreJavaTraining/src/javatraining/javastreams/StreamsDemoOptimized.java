package javatraining.javastreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemoOptimized {

	public void regular() {
		int count =0;
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Nikhil");
		nameList.add("Arijit");
		nameList.add("Akshay");
		nameList.add("Sowjanya");
		nameList.add("Shaswat");
		 for(int i=0;i<nameList.size();i++) {
			 String actual = nameList.get(i);
			 if(actual.startsWith("A")) {
				 count++;
			 }
		 }
		 //System.out.println("Count of names starting with alphabet A in the list: "+count);
		 
		 
		 //Using streams API we can filter the names starting with A and print the count
		long countName = nameList.stream().filter(name->name.startsWith("A")).count();
 		System.out.println("Count of names starting with alphabet A in the list: "+countName);
 		
 		long d = Stream.of("Nikhil","Arijit","Akshay","Sowjanya","Shaswat").filter(s->s.startsWith("S")).count();
 		System.out.println(d);
 		
 		//Print all the names 
		nameList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		 
		//Print only 1 name whose length is > 4 -> Nikhil
		nameList.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		 
		 
	}
	public static void main(String[] args) {
		StreamsDemoOptimized sdt = new StreamsDemoOptimized();
		sdt.regular();
	}

}
