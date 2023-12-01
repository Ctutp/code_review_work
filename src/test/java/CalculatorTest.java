import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(0, calculator.dif(1, 1));
    }

    @Test
    void div() {
        assertEquals(1, calculator.div(1, 1));
    }

    @Test
    void times() {
        assertEquals(3, calculator.times(3, 1));
    }

    @Test
    void solver() {
        assertEquals(76, calculator.solver());
    }
}