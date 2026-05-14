import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
        assertEquals(0, calc.add(0, 0));
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(5, -7));
        //TODO inser your realisation in test-method add
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-5, calc.dif(0, 5));
        assertEquals(5, calc.dif(5, 0));
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(12, calculator.dif(5, -7));
        //TODO inser your realisation in test-method dif
    }

    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
        assertEquals(0, calc.div(0, 5));
        assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
        assertEquals(2, calculator.div(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
        //TODO inser your realisation in test-method div
    }

    @Test
    void times() {
        assertEquals(6, calc.times(2, 3));
        assertEquals(0, calc.times(0, 5));
        assertEquals(-10, calc.times(-2, 5));
        assertEquals(15, calculator.times(5, 3));
        assertEquals(0, calculator.times(5, 0));
        //TODO inser your realisation in test-method times
    }

    @Test
    void solver() {
        assertEquals(10, calc.solver(10,5,2,3));
        assertEquals(17, calculator.solver());
        //TODO inser your realisation in test-method solver
    }
}