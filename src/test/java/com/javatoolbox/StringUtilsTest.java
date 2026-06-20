package com.javatoolbox;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("!olleh", StringUtils.reverse("hello!"));
        
        // Edge cases
        assertEquals("", StringUtils.reverse(""));
        assertEquals("", StringUtils.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("RaceCar"));
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        
        assertFalse(StringUtils.isPalindrome("hello"));
        
        // Edge cases
        assertFalse(StringUtils.isPalindrome(null));
        assertFalse(StringUtils.isPalindrome("   ")); // Only spaces
        assertTrue(StringUtils.isPalindrome("a"));
    }

    @Test
    public void testCountWords() {
        assertEquals(3, StringUtils.countWords("hello world java"));
        assertEquals(3, StringUtils.countWords("  hello   world  java  "));
        
        // Edge cases
        assertEquals(0, StringUtils.countWords(""));
        assertEquals(0, StringUtils.countWords(null));
        assertEquals(0, StringUtils.countWords("   "));
    }

    @Test
    public void testToTitleCase() {
        assertEquals("Hello World", StringUtils.toTitleCase("hello world"));
        assertEquals("Java Toolbox", StringUtils.toTitleCase("JAVA TOOLBOX"));
        assertEquals("A B C", StringUtils.toTitleCase("a b c"));
        
        // Edge cases
        assertEquals("", StringUtils.toTitleCase(""));
        assertEquals("", StringUtils.toTitleCase(null));
        assertEquals("", StringUtils.toTitleCase("   "));
    }
}
