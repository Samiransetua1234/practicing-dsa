package com.dsa.shorting;

public class InsertionShort {
	
	public static void IShort(int [] arr , int n) {
		// write code here
		for(int i = 1; i < n; i++) {
			int tmp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]>tmp) {
				arr[j+1] = arr [j];
				j--;
			}
			
			arr[j+1] = tmp;
		}
	}
	
	public static void Print(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {9, 4,1,5,3,7,8,2, 5, 1, 8};
		IShort(arr, arr.length);
		System.out.println("The Shorted array is : " );
		Print(arr);
		
		
	}
}
