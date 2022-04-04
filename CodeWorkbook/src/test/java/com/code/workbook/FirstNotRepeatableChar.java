package com.code.workbook;

import java.util.HashMap;

public class FirstNotRepeatableChar {

	public HashMap<Character, Integer> notRepeatable(String str) {
		
		HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(strMap.isEmpty()) {
			
				strMap.put(str.charAt(i), 1);
			}
			else {
					char ch = str.charAt(i);
					if(strMap.containsKey(ch)) {
						
						strMap.put(ch, strMap.get(ch)+1);
					}
					else {
						strMap.put(ch, 1);
				}
			}
		}
		return strMap;
	}
	
	public static void main(String[] args) {
		 FirstNotRepeatableChar obj = new FirstNotRepeatableChar();
		 String str = "aaabbbbccccdedddffrrrwwwwg";
		 HashMap<Character, Integer> retMap = obj.notRepeatable(str);
		 
		 for(int i=0; i<str.length(); i++) {
			 if(retMap.get(str.charAt(i)) == 1) {
				 System.out.println("First non-repeatable character is : "+str.charAt(i));
				 break;
			 }
		 }
	}
}
