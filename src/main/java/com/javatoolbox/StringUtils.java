package com.javatoolbox;

/**
 * Utility class providing common string manipulation operations.
 */
public class StringUtils {

    // Private constructor to prevent instantiation
    private StringUtils() {
    }

    /**
     * Reverses the provided string.
     *
     * @param s the string to reverse
     * @return the reversed string, or {@code ""} if the input is null or empty
     */
    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Checks if the given string is a palindrome.
     * The check is case-insensitive and ignores all spaces.
     *
     * @param s the string to check
     * @return {@code true} if the string is a palindrome, {@code false} otherwise
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        if (cleaned.isEmpty()) {
            return false; // A string of just spaces is not a meaningful palindrome here, though arguable
        }
        return cleaned.equals(reverse(cleaned));
    }

    /**
     * Counts the number of words in the given string.
     * Words are separated by one or more whitespace characters.
     *
     * @param s the string to count words in
     * @return the number of words, or {@code 0} if the input is null or blank
     */
    public static int countWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        return s.trim().split("\\s+").length;
    }

    /**
     * Converts a given string to Title Case, capitalizing the first letter of each word.
     * Words are delimited by whitespace.
     *
     * @param s the string to convert
     * @return the title-cased string, or {@code ""} if the input is null or empty
     */
    public static String toTitleCase(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        // Preserve leading spaces if any
        int leadingSpaces = 0;
        while (leadingSpaces < s.length() && Character.isWhitespace(s.charAt(leadingSpaces))) {
            sb.append(s.charAt(leadingSpaces));
            leadingSpaces++;
        }
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
            }
            if (i < words.length - 1) {
                // simple space joining, does not preserve exact multi-space between words 
                // per standard titlecase utils, unless specified otherwise. We'll use a single space.
                sb.append(" ");
            }
        }
        
        return sb.toString().trim();
    }
}
