import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
    }

    @Test
    void times() {
        assertEquals(15, calc.times(5, 3));
    }

    @Test
    void solver() {
        assertEquals(16, calc.solver());
    }
}
