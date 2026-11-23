import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void dif() {
        assertEquals(-3, calculator.dif(4, 7));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(7, 2));
    }

    @Test
    void divisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.div(7, 0));
    }

    @Test
    void times() {
        assertEquals(-12, calculator.times(3, -4));
    }

    @Test
    void solver() {
        assertEquals(16, calculator.solver());
    }
}