package matrixerprototype;

import matrixerprototype.SimpleCalculations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculationsTest {

    private final SimpleCalculations simpleClass = new SimpleCalculations();

    @Test
    void addition() {
        assertEquals(2, simpleClass.addition(1, 1));
    }

    @Test
    void subtraction() {
        assertEquals(0, simpleClass.subtraction(1, 1));
        assertTrue(simpleClass.subtraction(1, 2) >= 0);
        assertTrue(simpleClass.subtraction(2, 1) >= 0);
    }

    @Test
    void testSaveText() {
        simpleClass.saveSomeText();
    }

//    @Test
//    void multiplication() {
//        assertEquals(1, simpleClass.multiplication(1, 1));
//    }
}
