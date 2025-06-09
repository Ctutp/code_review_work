import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(-1, calculator.dif(2, 3));
        assertEquals(-3, calculator.dif(-2, 1));
        assertEquals(0, calculator.dif(0, 0));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(-4, 2));

    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-6, calculator.times(-2, 3));
        assertEquals(0, calculator.times(0, 5));
    }

    @Test
    void solver() {
        assertEquals(5, calculator.solver(2, 3, "add"));
        assertEquals(-1, calculator.solver(2, 3, "dif"));
        assertEquals(2, calculator.solver(6, 3, "div"));
        assertEquals(6, calculator.solver(2, 3, "times"));
    }
}