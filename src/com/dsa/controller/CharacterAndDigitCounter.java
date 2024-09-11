package com.dsa.controller;

import java.util.HashMap;
import java.util.Map;

public class CharacterAndDigitCounter {
//    public static void main(String[] args) {
//        String inputString = "Hello1234! World45689";
//        Map<Character, Integer> charCount = new HashMap<>();
//        Map<Character, Integer> digitCount = new HashMap<>();
//        Map<Character, Integer> specialCharCount = new HashMap<>();
//        int evenDigitCount = 0;
//        int oddDigitCount = 0;
//
//        for (char c : inputString.toCharArray()) {
//            if (Character.isLetter(c)) {
//                // If it's an alphabet character
//                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//            } else if (Character.isDigit(c)) {
//                // If it's a digit
//                digitCount.put(c, digitCount.getOrDefault(c, 0) + 1);
//                // Check if the digit is even or odd
//                int digit = Character.getNumericValue(c);
//                if (digit % 2 == 0) {
//                    evenDigitCount++;
//                } else {
//                    oddDigitCount++;
//                }
//            }else {
//                // It's a special character
//                specialCharCount.put(c, specialCharCount.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        System.out.println("Character Counts: " + charCount);
//        System.out.println("Digit Counts: " + digitCount);
//        System.out.println("Even Digit Count: " + evenDigitCount);
//        System.out.println("Odd Digit Count: " + oddDigitCount);
//    }
    
    public static void main(String[] args) {
        String inputString = "Hello123!   World456";
        Map<Character, Integer> charCount = new HashMap<>();
        int evenDigitCount = 0;
        int oddDigitCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                // If it's an alphabet character
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            } else if (Character.isDigit(c)) {
                // If it's a digit
                int digit = Character.getNumericValue(c);
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                // Check if the digit is even or odd
                if (digit % 2 == 0) {
                    evenDigitCount++;
                } else {
                    oddDigitCount++;
                }
            } else {
                // It's a special character
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Counts: " + charCount);
        System.out.println("Even Digit Count: " + evenDigitCount);
        System.out.println("Odd Digit Count: " + oddDigitCount);
    }
}
