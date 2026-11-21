import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    void times() {
        assertEquals(20, calculator.times(4, 5));
    }

    @Test
    void solver() {
        assertEquals(12, calculator.solver());
    }
}