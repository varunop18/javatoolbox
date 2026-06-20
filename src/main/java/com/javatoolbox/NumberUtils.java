package com.javatoolbox;

/**
 * Utility class providing common numerical and mathematical operations.
 */
public class NumberUtils {

    // Private constructor to prevent instantiation
    private NumberUtils() {
    }

    /**
     * Checks if a given number is prime.
     *
     * @param n the number to check
     * @return {@code true} if the number is prime, {@code false} otherwise
     * @throws InvalidInputException if the number is negative
     */
    public static boolean isPrime(int n) throws InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException("Negative numbers are not supported for primality testing.");
        }
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the factorial of a given number.
     * Uses a long return type to avoid integer overflow for small inputs.
     *
     * @param n the number
     * @return the factorial of the number
     * @throws InvalidInputException if the number is negative
     */
    public static long factorial(int n) throws InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException("Negative numbers are not supported for factorial calculation.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the absolute value of the greatest common divisor
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates the n-th Fibonacci number.
     * Implemented iteratively to avoid stack-depth issues (StackOverflowError) 
     * common with recursive implementations.
     *
     * @param n the index in the Fibonacci sequence (0-indexed)
     * @return the n-th Fibonacci number
     * @throws InvalidInputException if the index is negative
     */
    public static long fibonacci(int n) throws InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException("Negative index is not supported for Fibonacci sequence.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev1 = 0;
        long prev2 = 1;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}
