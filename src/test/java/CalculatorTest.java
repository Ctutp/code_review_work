import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(2,1));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4,2));
    }

    @Test
    void times() {
        assertEquals(4, calculator.times(2,2));
    }

    @Test
    void solver() {
        assertEquals("x1 : 3.0, x2 : 8.0", calculator.solver(1,-11,24));
    }
}