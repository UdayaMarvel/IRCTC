package com.priya;

public class TestProgram {

	public static void main(String[] args) {
		 String s1 = "java program";
	        String s2 = "automation language";
	        StringBuilder result = new StringBuilder();

	        int maxLength = Math.max(s1.length(), s2.length());

	        for (int i = 0; i < maxLength; i++) {
	            if (i < s1.length())
	                result.append(s1.charAt(i));
	            if (i < s2.length())
	                result.append(s2.charAt(i));
	        }

	        System.out.println("Combined String: " + result.toString());
	    System.out.println("new Code to create conflict between master and member branch")

	}

}
