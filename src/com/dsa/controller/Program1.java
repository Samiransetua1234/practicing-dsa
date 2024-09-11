package com.dsa.controller;

import java.util.Arrays;
import java.util.HashSet;

public class Program1 {
	public static boolean pythagorean(int [] arr) {
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int x : arr) {
			h.add(x*x);
		}
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				int c = (arr[i]*arr[i])+(arr[j]*arr[j]);
				if(h.contains(c)) return true;
			}
		}
		return false;
	}
	
	public static boolean pythagorean1(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			arr[i] = x*x;
		}
		Arrays.sort(arr);
		
		
		return false;
	}
}
