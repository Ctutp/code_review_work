import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator=new Calculator();
    @Test
    void add() {
        assertEquals(3,calculator.add(1,2));
    }

    @Test
    void dif() {
        assertEquals(4,calculator.dif(5,1));
    }

    @Test
    void div() {
        assertEquals(2,calculator.div(6,3));
    }

    @Test
    void times() {
        assertEquals(4,calculator.times(1,4));
    }

    @Test
    void solver() {
        assertEquals(508,calculator.solver(3,3,4));
    }
}