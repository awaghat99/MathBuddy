package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathBuddyTest {

    private final MathBuddy mathBuddy = new MathBuddy();

    @Test
    void testAddition() {
        assertEquals(5, mathBuddy.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, mathBuddy.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, mathBuddy.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, mathBuddy.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> mathBuddy.divide(5, 0));
    }
}

