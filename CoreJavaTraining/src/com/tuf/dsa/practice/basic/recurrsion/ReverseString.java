package com.tuf.dsa.practice.basic.recurrsion;

public class ReverseString {

	public static void reverse(char[] s,int left,int right) {
		if(left>=right) {
			return;
		}
		char temp = s[left];
		s[left]=s[right];
		s[right]=temp;
		reverse(s,left+1,right-1);
	}
	
	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		reverse(s,0,s.length-1);
		System.out.println(new String(s));
	}

}
