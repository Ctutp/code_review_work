import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(5, -7));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(12, calculator.dif(5, -7));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(15, calculator.times(5, 3));
        assertEquals(0, calculator.times(5, 0));
    }

    @Test
    void solver() {
        assertEquals(17, calculator.solver());
    }
}