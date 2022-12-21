import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(42, calc.add(33,9));
    }

    @Test
    void dif() {
        assertEquals(42, calc.dif(49,7));
    }

    @Test
    void div() {
        assertEquals(42, calc.div(84,2));
    }

    @Test
    void times() {
        assertEquals(42, calc.times(6,7));
    }

    @Test
    void solver() {
        assertEquals(42, calc.solver());
    }
}