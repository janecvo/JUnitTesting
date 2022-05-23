package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @DisplayName("Test addtion() method")
    @Test
    void testAddition() {
        assertEquals(5, Calculations.addition(3, 2));
    }

    @DisplayName("Test subtract() method")
    @Test
    void testSubtract() {
        assertEquals(5, Calculations.subtract(8, 3));
    }

    @DisplayName("Test multiply() method")
    @Test
    void testMulitply() {
        assertEquals(6, Calculations.multiply(3, 2));
    }

    @DisplayName("Test divide() method")
    @Test
    void testDivide() {
        assertEquals(1.5, Calculations.divide(3, 2));
    }

    @DisplayName("Test modulus() method")
    @Test
    void testModulus() {
        assertEquals(1, Calculations.modulus(3, 2));
    }
}
