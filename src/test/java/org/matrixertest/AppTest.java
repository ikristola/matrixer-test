package org.matrixertest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appTest() {
        App app = new App();
        assertTrue(app.run());
    }
}