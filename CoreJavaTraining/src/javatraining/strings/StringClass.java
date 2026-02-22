package javatraining.strings;

public class StringClass {

	public static void main(String[] args) {

		//String : it is one of the pre-built class in Java
		//To manipulate strings, we can simply create an object of string class and manipulate it.
		
		//Ways we can define a String 
		//1. String literal 2. Object of a String
		
		String s1 = "Hello";
		String s2 ="Hello";
		//Both s1 and s2 point to same object. (No duplicate object created)
		
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		String s = " javatraining";
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("t"));
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(4));
		System.out.println(s.concat("Nikhil"));
		
		//to remove white spaces from string
		System.out.println(s.trim());
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//To split the string
		String arr[] = s.split("t"); //t won't be included
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(s.replace("t", "v"));

	}

}
