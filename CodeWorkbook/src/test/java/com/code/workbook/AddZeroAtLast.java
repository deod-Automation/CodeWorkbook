package com.code.workbook;

public class AddZeroAtLast {

	
	public int[] putZeroAtlast(int arr[]) {
		
		int reqArr[] = new int[arr.length];
		int count=0, c=0;
		for(int i=0; i<arr.length; i++) {			
			if(arr[i] != 0) {
				reqArr[c] = arr[i];
				c++;
			}
			else {
				count = count+1;
			}
		}
		while(count > 0) {
			reqArr[c] = 0;
			c++;
			count--;
		}	
		return reqArr;
	}
	public static void main(String[] args) {
		
		AddZeroAtLast obj = new AddZeroAtLast();
		
		int arr[] = {0,4,0,1,0,0,5,8,0,2,0,5,7,9};
		
		int reqArr[] = obj.putZeroAtlast(arr);
		
		System.out.print("Array with all Zero at last from the required array is : ");
		for(int x: reqArr) {
			
			System.out.print(x+" ");
		}
	}
}
