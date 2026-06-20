package com.javatoolbox.demo;

import com.javatoolbox.NumberUtils;
import com.javatoolbox.StringUtils;
import com.javatoolbox.InvalidInputException;

/**
 * Entry point for demonstrating the JavaToolbox library.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       JavaToolbox Library Demo          ");
        System.out.println("=========================================\n");

        System.out.println("--- StringUtils ---");
        
        String sampleStr = "hello world java";
        System.out.println("Original String: '" + sampleStr + "'");
        System.out.println("Reversed: '" + StringUtils.reverse(sampleStr) + "'");
        System.out.println("Title Cased: '" + StringUtils.toTitleCase(sampleStr) + "'");
        System.out.println("Word Count: " + StringUtils.countWords(sampleStr));
        
        String palindrome = "A man a plan a canal Panama";
        System.out.println("Is '" + palindrome + "' a palindrome? " + StringUtils.isPalindrome(palindrome));
        
        System.out.println("\n--- NumberUtils ---");
        
        int n = 7;
        try {
            System.out.println("Is " + n + " prime? " + NumberUtils.isPrime(n));
            System.out.println(n + " factorial is: " + NumberUtils.factorial(n));
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + NumberUtils.gcd(a, b));
        
        int fibIndex = 10;
        try {
            System.out.println("Fibonacci number at index " + fibIndex + " is: " + NumberUtils.fibonacci(fibIndex));
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=========================================");
    }
}
