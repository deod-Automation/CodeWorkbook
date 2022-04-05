package com.code.workbook;

import java.util.Stack;

public class CheckBalancedString {

	public static void main(String[] args) {
		
		String str = "}{()[]()";
		
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i< str.length();i++) {
			
			if((str.charAt(i)=='{') || (str.charAt(i)=='[') || (str.charAt(i)=='(')) {
				
				s.push(str.charAt(i));
			}
			else if((!s.isEmpty()) && ((str.charAt(i) == '}' && s.peek() == '{') || (str.charAt(i) == ']' && s.peek() == '[') || (str.charAt(i) == ')' && s.peek() == '('))) {
				
					s.pop();	
				}
				else {
					s.push(str.charAt(i));
				}
			
		}
		
		if(s.isEmpty()) {
			System.out.println(str+" -----> Balanced String");
		}
		else {
			System.out.println(str+" -----> UnBalanced String");
		}

	}

}
