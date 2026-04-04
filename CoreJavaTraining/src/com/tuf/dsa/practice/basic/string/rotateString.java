	package com.tuf.dsa.practice.basic.string;
	
	public class rotateString {
	
		public static void main(String[] args) {
	
			String s ="abcde";
			String goal = "cdeab";
			
			 if(s.length()!=goal.length()){
		            System.out.println("String will not match to goal string after any rotation");
		            return;
		        }
		     String temp=s;
		     for(int i=0;i<s.length();i++) {
		    	 temp = temp.substring(1)+temp.charAt(0);
		    	 if(temp.equals(goal)) {
		    		 System.out.println("String will match to goal string after "+(i+1)+" rotations");
		    		 return;
		    	 }
		     }
		     System.out.println("String will not match to goal string after any rotation");
	
		}
	
	}
