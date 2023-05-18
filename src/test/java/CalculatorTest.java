import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(7,2));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(10,2));
    }

    @Test
    void times() {
        assertEquals(5, calculator.times(1,5));
    }

    @Test
    void solver() { //factorial
        assertEquals(120, calculator.solver(5));
    }
}