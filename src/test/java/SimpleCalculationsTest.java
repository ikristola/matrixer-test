import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculationsTest {

    private final SimpleCalculations simpleClass = new SimpleCalculations();

    @Test
    void addition() {
        assertEquals(2, simpleClass.addition(1, 1));
    }

    @Test
    void subtraction() {
        assertEquals(0, simpleClass.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(1, simpleClass.multiplication(1, 1));
    }
}
