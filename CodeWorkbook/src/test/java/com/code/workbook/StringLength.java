package com.code.workbook;

/**
 * 
 * Write a code to count the size of a string without using string methods(length())
 *
 */
public class StringLength {

	public static void main(String[] args) {
		
		String str = "Selenium Code Test", strArr[];
		int count = 0;
		
		strArr = str.split("");
		
		for(String s: strArr) {
			
			count++;
		}
		System.out.println("Length of string without String builders : "+count);
	}

}
