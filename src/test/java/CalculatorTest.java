import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(2,1));
    }

    @Test
    void div() throws Exception{
        assertEquals(3, calculator.div(6,2));
        assertThrows(Exception.class, ()->calculator.div(2,0));
    }

    @Test
    void times() {
        assertEquals(4, calculator.times(2,2));
    }

    @Test
    void solver() throws Exception{
        assertEquals(121, calculator.solver(10,2,5));
    }
}