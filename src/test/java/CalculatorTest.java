import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(1, calc.dif(3, 2));
    }


    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
    }

    @Test
    void times() {
        assertEquals(12, calc.times(3, 4));
    }

    @Test
    void solver() {
        assertEquals(14, calc.solver());
    }
}