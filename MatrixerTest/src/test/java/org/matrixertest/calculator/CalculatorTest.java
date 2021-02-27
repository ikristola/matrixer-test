package org.matrixertest.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator simpleClass = new Calculator();

    @Test
    void addition() {
        assertEquals(2, simpleClass.addition(1, 1));
    }

    @Test
    void subtraction() {
        assertEquals(0, simpleClass.subtraction(1, 1));
        assertEquals(-1, simpleClass.subtraction(1, 2));
        assertEquals(1, simpleClass.subtraction(2, 1));
    }

    @Test
    void multiplication() {
        assertEquals(1, simpleClass.multiplication(1, 1));
    }

    @Test
    void callMultipleFunctions() {
        assertEquals(0, simpleClass.subtraction(1, 1));
        assertEquals(2, simpleClass.addition(1, 1));
    }

}
