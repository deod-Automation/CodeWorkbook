package com.code.workbook;

public class FibonacciRecursiveMethod {

	int f=0, s=1, t;
	public void fibonacciPrint(int count) {
		
		if(count > 0) {
			
			t = f+s;
			f=s;
			s=t;
			System.out.print(" "+t);
			fibonacciPrint(count - 1);
		}
	}
	public static void main(String[] args) {
		
		FibonacciRecursiveMethod obj = new FibonacciRecursiveMethod();
		int count = 20;
		System.out.print("Fibonacci Series upto count "+count+" is : "+obj.f);
		System.out.print(" "+obj.s);
		obj.fibonacciPrint(count-2);

	}

}
