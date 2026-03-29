package com.tuf.dsa.practice.basic.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public void reverseString(List<Character> s) {
		int i=0;
		int j=s.size()-1;
		while(i<j) {
			char temp = s.get(i);
			s.set(i, s.get(j));
			s.set(j,temp);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('h');
		list.add('e');
		list.add('l');
		list.add('l');
		list.add('o');
		ReverseString obj = new ReverseString();
		obj.reverseString(list);
		System.out.println("Reversed string: "+list);
	}

}
