import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(33, calc.add(22,11));
    }

    @Test
    void dif() {
        assertEquals(33, calc.dif(44,11));
    }

    @Test
    void div() {
        assertEquals(33, calc.div(99,3));
    }

    @Test
    void times() {
        assertEquals(33, calc.times(11,3));
    }

    @Test
    void solver() {
        assertEquals(100, calc.solver());
    }
}