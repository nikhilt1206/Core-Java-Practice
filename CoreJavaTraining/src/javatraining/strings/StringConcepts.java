package javatraining.strings;

public class StringConcepts {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";
		String f = "hello";
		//Here b won't create any object in memory instead it will point to same object  as a which is "Hello"
		String e = a.concat("World");
		System.out.println(e);
		
		
		String c = new String("Hello");
		String d = new String("Hello");
		//Here c and d variables will refer to different objects even though the contents are same and both are treated as different.
		
		//Strings are immutable : it cannot be altered or changed.
		
		//Since strings are immutable so to work on them we have 2 classes - String buffer and String builder
		//These 2 classes are mutable
		//String Buffer is thread safe and it is synchronized. (One thread at a time)
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2,"she");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(12);
		sb.reverse();
		System.out.println(sb);
		
		//String builder is not thread safe. It is not synchronized.(It is faster)
		
		StringBuilder sc = new StringBuilder("NikhilTiwari");
		System.out.println(sc);
		sc.append("JavaTraining");
		System.out.println(sc);
		sc.insert(3, "program");
		System.out.println(sc);
		sc.replace(5, 8, "work");
		System.out.println(sc);
		sc.deleteCharAt(10);
		System.out.println(sc);
		sc.reverse();
		System.out.println(sc);
		
		//When to use == and .equals() method to compare 2 strings
		//equals() method will compare the content of the strings
		System.out.println(a.equals(b));
		
		// == operator compares the reference -> to which object it was referring
		System.out.println(a==b);
		
		System.out.println(c.equals(d));
		System.out.println(c==d);
		System.out.println(a.equalsIgnoreCase(f));

	}

}
