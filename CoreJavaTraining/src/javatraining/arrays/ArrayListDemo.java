package javatraining.arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//All the classes which implements list interface can have duplicate values.
		//classes that extends List interfaces - ArrayList, LinkedList and Vector
		//Arrays have fixed size whereas ArrayList can grow dynamically 
		//You can access and insert any value in any index in ArrayList
		
		
		ArrayList<String> a = new ArrayList<String>(); //size is not fixed as arrays - we can add/remove elements any time (Dynamic)
		a.add("Nikhil");
		a.add("Sowjanya");
		a.add("Nikhil");
		a.add("Sowjanya");
		System.out.println(a); //no loop required to print the elements of the arraylist
		a.add(0, "student"); //added string at the 0th index
		System.out.println(a);
		//a.remove(1); //removes Nikhil at index 1 from the list 
		System.out.println(a);
		//a.remove("student");
		System.out.println(a);
		System.out.println(a.get(2));//it will give the string at index 2
		//To check if particular string is present in the arraylist or not
		System.out.println(a.contains("Testing"));
		//To get the index of a string
		System.out.println(a.indexOf("Sowjanya"));
		//To check if arraylist is empty or not 
		System.out.println(a.isEmpty());
		//To know the size of the Arraylist 
		System.out.println(a.size());
	}

}
 