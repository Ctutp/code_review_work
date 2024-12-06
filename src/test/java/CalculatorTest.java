import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(100, calculator.add(50,50));
    }

    @Test
    void dif() {
        assertEquals(-1, calculator.dif(2, 3));
        assertEquals(4, calculator.dif(2, -2));
        assertEquals(0, calculator.dif(50,50));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4, 2));
        assertThrows(ArithmeticException.class, () -> calculator.div(4, 0));
        assertEquals(1, calculator.div(5,5));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(5,0));
        assertEquals(25, calculator.times(5,5));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(11, calculator.solver());
    }
}