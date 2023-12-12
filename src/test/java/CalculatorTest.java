import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        //TODO inser your realisation in test-method add
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    void dif() {
        //TODO inser your realisation in test-method dif
        assertEquals(2,calculator.dif(5,3));

    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
        assertEquals(4,calculator.div(8,2));
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
        assertEquals(6,calculator.times(2,3));
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
        assertEquals(3,calculator.solver());
    }
}