package com.dsa.controller;

public class ReverseString {
	public static void main(String[] args) {
		String s = "a good   example";
		
		
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
		StringBuffer sb = new StringBuffer();
		String[] arr = s.split(" ");
		for(int i = arr.length-1; i >=0; i--) {
			if (arr[i] != "") {
				sb.append(arr[i]);
				sb.append(" ");
			}
			
		}
		return sb.toString();
	}
}
