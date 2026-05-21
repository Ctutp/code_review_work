import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(1,calculator.add(1,0));
        assertEquals(2,calculator.add(1,1));
        assertEquals(2,calculator.add(1,1));
        assertEquals(3,calculator.add(1,2));
    }

    @Test
    void dif() {
        assertEquals(0,calculator.dif(1,1));
        assertEquals(1,calculator.dif(2,1));
        assertEquals(1,calculator.dif(2,1));
        assertEquals(2,calculator.dif(3,1));
    }

    @Test
    void div() {
        assertEquals(2,calculator.div(2,1));
        assertEquals(3,calculator.div(3,1));
        assertEquals(1,calculator.div(1,1));
        assertEquals(3,calculator.div(9,3));
    }

    @Test
    void times() {
        assertEquals(3,calculator.times(3,1));
        assertEquals(2,calculator.times(2,1));
        assertEquals(4,calculator.times(2,2));
        assertEquals(1,calculator.times(1,1));
    }

    @Test
    void solver() {
        assertEquals(3,calculator.solver(1,2,3,4));
    }
}