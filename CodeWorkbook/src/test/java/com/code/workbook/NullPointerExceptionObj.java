package com.code.workbook;


/**
 * 
 * Write a code to give Null Pointer exception
 *
 */
public class NullPointerExceptionObj {
	
	public void nullExceptionPrint() {
		
		System.out.println("Test");
	}
	public static void main(String[] args) {
		
		NullPointerExceptionObj obj = null;
		obj.nullExceptionPrint();
	}

}
