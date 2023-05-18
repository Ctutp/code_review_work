import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(15, calculator.add(11, 4));
    }

    @Test
    void dif() {
        assertEquals(37, calculator.dif(51, 14));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(29, 11));
    }

    @Test
    void times() {
        assertEquals(63, calculator.times(9, 7));
    }

    @Test
    void solver() {
        assertEquals(6, calculator.times(calculator.div(calculator.add(15, 10), calculator.dif(25, 13)), 3));
    }
}