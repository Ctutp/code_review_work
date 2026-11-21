import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(-2, calculator.dif(3, 5));
        assertEquals(0, calculator.dif(7, 7));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
        assertEquals(3, calculator.div(10, 3)); // целочисленное деление
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(15, calculator.times(3, 5));
        assertEquals(0, calculator.times(0, 100));
        assertEquals(-6, calculator.times(-2, 3));
    }

    @Test
    void solver() {
        assertEquals(28, calculator.solver());
    }
}