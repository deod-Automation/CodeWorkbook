package com.code.workbook;

public class SentenceWordReverse {
	
	public String reverseString(String str) {
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		SentenceWordReverse obj = new SentenceWordReverse();
		
		String str = "This is a Java Code", strArr[],revStr="",senArr[],senRev="";
		
		strArr = str.split(" ");
		
		for(String s:strArr) {
			
			revStr = revStr+obj.reverseString(s)+" ";
		}
		senArr = revStr.split(" ");
		
		for(int j=senArr.length-1; j>=0; j--) {
			
			senRev = senRev+senArr[j]+" ";
		}
		System.out.println("The final reversed string of ("+str+") is : "+senRev);
	}
}
