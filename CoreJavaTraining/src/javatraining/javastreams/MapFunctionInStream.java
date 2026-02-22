package javatraining.javastreams;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapFunctionInStream {

	public void show() {
		ArrayList<String> nameList = new ArrayList<String>();
		int count = 0;
		nameList.add("Nikhil");
		nameList.add("Arijit");
		nameList.add("Akshay");
		nameList.add("Sowjanya");
		nameList.add("Shaswat");
		for (int i = 0; i < nameList.size(); i++) {
			String actual = nameList.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		
		//print names ends with a to Uppercase - > convert names to uppercases
//		Stream.of("Nikhil","Rajat","Abhishek","Rama","Jitendra","Akash").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		List<String> names = Arrays.asList("Nikhil","Rajat","Abhishek","Rama","Jitendra","Akash");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

	public static void main(String[] args) {
		MapFunctionInStream mp = new MapFunctionInStream();
		mp.show();
	}

}