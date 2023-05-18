import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(calculator.add(1 , 0), 1);
    }

    @Test
    void dif() {
        assertEquals(calculator.dif(2 , 3), -1);
    }

    @Test
    void div() {
        assertEquals(calculator.div(4 , 2), 2);
    }

    @Test
    void times() {
        assertEquals(calculator.times(22 , 8), 176);
    }

    @Test
    void solver() {
        assertEquals(calculator.solver(), 8);
    }
}