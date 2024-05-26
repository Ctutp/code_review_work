import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(2, 1));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(9, 3));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(5, 2));
    }

    @Test
    void solver() {
        assertEquals(10, calculator.solver(4, 2));
    }
}
