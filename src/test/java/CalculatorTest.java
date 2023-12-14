import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(5, 3);
        assertEquals(2, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(6, 2);
        assertEquals(3, result);
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(4, 3);
        assertEquals(12, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver();
        assertNotNull(result);
    }
}