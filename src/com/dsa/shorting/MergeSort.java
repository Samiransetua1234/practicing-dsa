package com.dsa.shorting;

import java.util.ArrayList;

public class MergeSort {
	
	public static void Msort(int[]arr, int lb, int ub) {
		if(lb<ub) {
			int mid = (lb+ub)/2;
			Msort(arr, lb, mid);
			Msort(arr, mid+1, ub);
			
			Merge(arr, lb, mid, ub);
		}
	}
	
	private static void Merge(int[] arr, int lb, int mid, int ub) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> temp = new ArrayList<>(); 
        int i = lb;      
        int j = mid + 1;


        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }



        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }


        while (j <= ub) {
            temp.add(arr[j]);
            j++;
        }


        for (int k = lb; k <= ub; k++) {
            arr[k] = temp.get(k - lb);
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
		int [] arr = {9,8,7,6,5,4,3,2,1};
		Msort(arr, 0, arr.length-1);
		System.out.println("The Shorted array is : " );
		Print(arr);
		
		
	}
}
