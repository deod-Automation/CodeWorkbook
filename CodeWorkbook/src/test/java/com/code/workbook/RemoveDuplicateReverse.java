package com.code.workbook;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateReverse {
	
	public String removeDuplicate(String str) {
		
		String revStr = "",strArr[];
		strArr = str.split(" ");
		
		for(String s: strArr) {
			
			Set<String> ch = new LinkedHashSet<>();
			String combString="", revArr[],trimStr="";
			revArr = s.split("");
			for(String c:revArr) {
				ch.add(c.toLowerCase());
			}
			for(String stArr:ch) {
				
				combString = combString + stArr;
			}
			
			for(int i=combString.length()-1; i>=0; i--) {
				
				trimStr = trimStr+combString.charAt(i);
			}
			revStr = revStr + trimStr +" ";
		}
		
		return revStr;
	}

	public static void main(String[] args) {
		
		RemoveDuplicateReverse obj = new RemoveDuplicateReverse();
		String str = "Yeeesssss Sssseeelleeennniiiummmm"; 
		
		System.out.println("Final string after removal of Duplicate & Reverse is : "+obj.removeDuplicate(str));
		
	}

}
