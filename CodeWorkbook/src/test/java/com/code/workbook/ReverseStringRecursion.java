package com.code.workbook;

/**
 * 
 * Write a code reverse a string by Recursive Method
 *
 */
public class ReverseStringRecursion {
	
	String revStr = "";
	public String reverseString(String str) {
		
		if(str.length() > 0) {
			
			revStr = revStr + str.charAt(str.length()-1);
			reverseString(str.substring(0, str.length()-1));
		}
		return revStr;
	}

	public static void main(String[] args) {
		
		ReverseStringRecursion obj = new ReverseStringRecursion();
		String str = "String Reversal";
		System.out.println("The Reversed String of ("+str+") is : "+obj.reverseString(str));
	}
}
