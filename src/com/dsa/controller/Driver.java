package com.dsa.controller;

public class Driver {
	public static void main(String[] args) {
//		int [] arr = {3,8,5};
//		
//		boolean a = Program1.pythagorean(arr);
//		if(a) System.out.println("Yes");
//		else if(!a) System.out.println("No");
		int [][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}; 
		
		for(int i= 0; i < arr2.length; i++) {
			for(int j =0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+", ");
			}
			System.out.println();
		}
		RotateMatrix.rotate(arr2);
		System.out.println();
		for(int i= 0; i < arr2.length; i++) {
			for(int j =0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+", ");
			}
			System.out.println();
		}
	}
}
