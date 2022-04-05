package com.code.workbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayCheck {

	public static void main(String[] args) {
		
		ArrayList<String> actArr = new ArrayList<String>();
		ArrayList<String> expArr = new ArrayList<String>();
		
		actArr.add("Automation");
		actArr.add("Cucumber");
		actArr.add("Git");
		actArr.add("Java");
		actArr.add("Jenkins");
		actArr.add("Maven");
		actArr.add("Selenium");
		System.out.println(actArr);
		actArr.add(2, "test");
		System.out.println(actArr);
		expArr.addAll(actArr);
		
		Collections.sort(expArr);
		
		for (String s : expArr) {
			
			System.out.print(s.toString()+" ");
		}
		
		if(actArr.equals(expArr)) {
			
			System.out.println("--> This is a sorted array");
		}
		else {
			System.out.println("Not Sorted Array");
		}

		
	}

}
