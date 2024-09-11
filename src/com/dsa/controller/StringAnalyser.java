package com.dsa.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAnalyser {
	public void countSequense(String str){
        Map<Character, Integer> map = new HashMap<>();
        int evenDigitCount = 0;
        int oddDigitCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                // If it's an alphabet character
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else if (Character.isDigit(c)) {
                // If it's a digit
                int digit = Character.getNumericValue(c);
                map.put(c, map.getOrDefault(c, 0) + 1);
                // Check if the digit is even or odd
                if (digit % 2 == 0) {
                    evenDigitCount++;
                } else {
                    oddDigitCount++;
                }
            } else {
                // It's a special character
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Counts: " + map);
        System.out.println("Even Digit Count: " + evenDigitCount);
        System.out.println("Odd Digit Count: " + oddDigitCount);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any String....");
		String str = scanner.nextLine();
		
		
		StringAnalyser obj = new StringAnalyser();
		
		obj.countSequense(str);
		
	}
}
