package org.matrixertest.printer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void testPrintInput() {
        Printer printer = new Printer();
        String expected = "expected";
        assertDoesNotThrow(() -> printer.printInput(expected));
    }
}