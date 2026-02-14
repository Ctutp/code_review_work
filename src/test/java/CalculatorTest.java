import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(10, calculator.add(10, 0));
        assertEquals(25, calculator.add(15, 10));
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(10, 5));
        assertEquals(10, calculator.dif(10, 0));
        assertEquals(5, calculator.dif(15, 10));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(10, 5));
        assertEquals(1, calculator.div(10, 10));
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }

    @Test
    void times() {
        assertEquals(50, calculator.times(10, 5));
        assertEquals(0, calculator.times(10, 0));
        assertEquals(150, calculator.times(15, 10));
    }

    @Test
    void solver() {
        assertEquals(1059, calculator.add(74, 985));
        assertEquals(97428, calculator.times(1059, 92));
        assertEquals(97402, calculator.dif(97428, 26));
        assertEquals(1739, calculator.div(97402, 56));
        assertEquals(1739, calculator.solver());
    }
}
