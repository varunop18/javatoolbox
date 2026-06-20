package com.javatoolbox;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InvalidInputExceptionTest {

    @Test
    public void testExceptionMessage() {
        String expectedMessage = "Negative numbers are not supported";
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            throw new InvalidInputException(expectedMessage);
        });

        assertEquals(expectedMessage, exception.getMessage());
    }
}
