package javatraining.javastreams;

import java.util.ArrayList;

public class StreamsDemo {

	//Count the number of names starting with alphabet A in the list
	
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
		 System.out.println("Count of names starting with alphabet A in the list: "+count);
	}

	
	public static void main(String[] args) {

		StreamsDemo sd = new StreamsDemo();
		sd.regular();

	}

}
