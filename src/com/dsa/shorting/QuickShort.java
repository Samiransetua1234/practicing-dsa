package com.dsa.shorting;

public class QuickShort {
	
	public static void QShort(int [] arr, int lb , int ub) {
		// write code here
		if(lb < ub) {
			int partI = Partition(arr, lb, ub);
			QShort(arr, lb, partI-1);
			QShort(arr, partI+1, ub);
		}
	}
	
	private static int Partition(int [] arr, int lb, int ub) {
		int pivot = arr[lb] , start = lb, end = ub;
		
		while(start<end) {
			while(start <= ub && arr[start] <= pivot) start++;
			while(end >= lb && arr[end] > pivot) end--;
			
			if(start < end) Swap(arr, start, end);
		}
		
		Swap(arr, lb, end);
		
		return end;
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
		int [] arr = {9,8,7,6,5,4,3,2,1};
		QShort(arr, 0, arr.length-1);
		System.out.println("The Shorted array is : " );
		Print(arr);
		
		
	}

}
