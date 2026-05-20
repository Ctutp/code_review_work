import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {

        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(0, calculator.dif(0, 0));
        assertEquals(-3, calculator.dif(-1, 2));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(2, calculator.div(10, 5));
        assertEquals(0, calculator.div(0, 5));
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(15, calculator.times(3, 5));
        assertEquals(0, calculator.times(0, 5));
        assertEquals(-6, calculator.times(-2, 3));
    }

    @Test
    void solver() {
        assertEquals(17, calculator.solver());
    }
}