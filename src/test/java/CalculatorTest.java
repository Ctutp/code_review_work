import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(10, calculator.add(2, 8));
        assertEquals(10, calculator.add(4, 6));
        assertEquals(10, calculator.add(-10, 20));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(25, 15));
        assertEquals(10, calculator.dif(150, 140));
        assertEquals(10, calculator.dif(0, -10));
        assertEquals(10, calculator.dif(19, 9));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(100, 10));
        assertEquals(10, calculator.div(20, 2));
        assertEquals(1, calculator.div(5, 5));
        assertEquals(10, calculator.div(-50, -5));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(2, 5));
        assertEquals(10, calculator.times(-5, -2));
        assertEquals(10, calculator.times(10, 1));
        assertEquals(18, calculator.times(3, 6));
    }

    @Test
    void solver() {
        assertEquals(25, calculator.solver(2, 3));
    }
}