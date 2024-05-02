package com.dsa.shorting;

public class BubbleShort {
	public static void SShort(int [] arr , int n) {
		// write code here
		for(int i = 0; i < n-1; i++) {
			boolean flag = false;
			for(int j = 0; j < n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					 Swap(arr, j, j+1);
					 flag = true;
				}
			}
			if(!flag) break;
		}
	}
	
	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void Print(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {9, 4,1,5,3,7,8,2, 5, 1, 8};
		SShort(arr, arr.length);
		System.out.println("The Shorted array is : " );
		Print(arr);
		
		
	}
}
