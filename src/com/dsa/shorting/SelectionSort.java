package com.dsa.shorting;

public class SelectionSort {
	
	public static void SShort(int [] arr) {
		// write code here
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int minEleIndex = i; 
			for(int j = i; j < n; j++) {
				if(arr[j] < arr[minEleIndex]) {
					minEleIndex = j;
				}
			}
			
			if(minEleIndex != i) {
				Swap(arr, i , minEleIndex);
			}
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
		int [] arr = {0,9, 4,1,5,3,7,8,2, 5, 1, 8};
		SShort(arr);
		System.out.println("The Shorted array is : " );
		Print(arr);
		
		
	}
}
