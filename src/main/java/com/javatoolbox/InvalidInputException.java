package com.javatoolbox;

/**
 * Custom checked exception thrown when an invalid input is provided to a utility method.
 *
 * For example, this is thrown when a negative number is passed to mathematical methods
 * that do not support them, such as {@link NumberUtils#factorial(int)} or
 * {@link NumberUtils#isPrime(int)}.
 */
public class InvalidInputException extends Exception {

    /**
     * Constructs a new {@code InvalidInputException} with the specified detail message.
     *
     * @param message the detail message explaining why the input was invalid
     */
    public InvalidInputException(String message) {
        super(message);
    }
}
