package com.javatoolbox;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberUtilsTest {

    @Test
    public void testIsPrime() throws InvalidInputException {
        assertTrue(NumberUtils.isPrime(2));
        assertTrue(NumberUtils.isPrime(3));
        assertTrue(NumberUtils.isPrime(17));
        
        assertFalse(NumberUtils.isPrime(0));
        assertFalse(NumberUtils.isPrime(1));
        assertFalse(NumberUtils.isPrime(4));
        assertFalse(NumberUtils.isPrime(15));
        
        // Edge cases
        assertThrows(InvalidInputException.class, () -> NumberUtils.isPrime(-1));
        assertThrows(InvalidInputException.class, () -> NumberUtils.isPrime(-17));
    }

    @Test
    public void testFactorial() throws InvalidInputException {
        assertEquals(1L, NumberUtils.factorial(0));
        assertEquals(1L, NumberUtils.factorial(1));
        assertEquals(2L, NumberUtils.factorial(2));
        assertEquals(6L, NumberUtils.factorial(3));
        assertEquals(120L, NumberUtils.factorial(5));
        
        // Edge cases
        assertThrows(InvalidInputException.class, () -> NumberUtils.factorial(-1));
        assertThrows(InvalidInputException.class, () -> NumberUtils.factorial(-5));
    }

    @Test
    public void testGcd() {
        assertEquals(2, NumberUtils.gcd(4, 6));
        assertEquals(6, NumberUtils.gcd(18, 24));
        assertEquals(1, NumberUtils.gcd(17, 13));
        
        // Edge cases
        assertEquals(5, NumberUtils.gcd(5, 0));
        assertEquals(5, NumberUtils.gcd(0, 5));
        assertEquals(0, NumberUtils.gcd(0, 0));
        assertEquals(2, NumberUtils.gcd(-4, 6));
        assertEquals(2, NumberUtils.gcd(4, -6));
        assertEquals(2, NumberUtils.gcd(-4, -6));
    }

    @Test
    public void testFibonacci() throws InvalidInputException {
        assertEquals(0L, NumberUtils.fibonacci(0));
        assertEquals(1L, NumberUtils.fibonacci(1));
        assertEquals(1L, NumberUtils.fibonacci(2));
        assertEquals(2L, NumberUtils.fibonacci(3));
        assertEquals(3L, NumberUtils.fibonacci(4));
        assertEquals(5L, NumberUtils.fibonacci(5));
        assertEquals(55L, NumberUtils.fibonacci(10));
        
        // Edge cases
        assertThrows(InvalidInputException.class, () -> NumberUtils.fibonacci(-1));
    }
}
