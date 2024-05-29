import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.dif(3, 2));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4, 2));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(29, calculator.solver());
    }
}