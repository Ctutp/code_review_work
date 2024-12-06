import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(10,5));
    }

    @Test
    void div() {
        assertEquals(6, calculator.div(10,4));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(5,2));
    }

    @Test
    void solver() {
        assertEquals(6, calculator.solver());
    }
}