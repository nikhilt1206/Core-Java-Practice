package javatraining.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeStreams {

	public void merge() {
		List<String> s1 = Arrays.asList("Sowmya","Swati","Preeti","Smiriti","Puja");
		List<String> s2 = Arrays.asList("Vandana","Anajali","Naila","Aparna","Pritam");
		
		//merge 2 streams and print them in sorted order
		Stream<String> newStream = Stream.concat(s1.stream(), s2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//match - true/false
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Anjali"));
		System.out.println(flag);
		
		//Collect method - to collect result and convert it back to any list 
		List<String> list = Stream.of("Nikhil","Rajat","Abhishek","Rama","Jitendra","Akash").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
        .collect(Collectors.toList());
		System.out.println(list.get(0));
		
		//print unique number from array and sort them
		List<Integer> num = Arrays.asList(3,2,2,7,5,1,9,7);
		num.stream().distinct().sorted().forEach(s->System.out.print(s+" "));
		List<Integer> li = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("\n"+li.get(2));

		
		
	}
	
	
	
	
	public static void main(String[] args) {

		MergeStreams ms = new MergeStreams();
		ms.merge();
		
	}

}
