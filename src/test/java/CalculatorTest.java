import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(3, calculator.add(1,2));
        assertEquals(1, calculator.add(-1,2));
    }

    @Test
    void dif() {
        assertEquals(4, calculator.dif(6,2));
        assertEquals(-6, calculator.dif(2,8));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(9,3));
        assertEquals(-3, calculator.div(9,-3));
    }

    @Test
    void times() {
        assertEquals(-12, calculator.times(-6,2));
        assertEquals(6, calculator.times(2,3));
    }

    @Test
    void solver() {
        assertEquals(-5, calculator.solver(2,3));
    }
}