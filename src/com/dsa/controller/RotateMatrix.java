package com.dsa.controller;

public class RotateMatrix {
	public static int[][] rotate(int [][] arr){
		int x = arr.length;
		for(int i =0; i < arr.length; i++) {
			for(int j = i; j < x; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			int j = 0, k = arr.length-1;
			while(j != k) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
				j++;
				k--;
			}
		}
		return arr;
	}
}
