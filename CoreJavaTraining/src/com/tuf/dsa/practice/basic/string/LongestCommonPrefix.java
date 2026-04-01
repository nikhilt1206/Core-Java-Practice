package com.tuf.dsa.practice.basic.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = {"flowers", "flow", "fly", "flight"}; 
		String prefix="";
		for(int i=0;i<str[0].length();i++) {
			for(int j=1;j<str.length;j++) {
				if(i>=str[j].length() || str[0].charAt(i)!=str[j].charAt(i)) {
					System.out.println("Prefix: "+prefix);
					return;
				}
			}
			prefix=prefix+str[0].charAt(i);
		}
		System.out.println("Prefix: "+prefix);
	}

}
