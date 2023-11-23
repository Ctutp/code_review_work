import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest {
    Calculator myCalculator = new Calculator();
    @Test
    void sum() {
        assertEquals(5, myCalculator.sum(2, 3));
        assertEquals(2.3, myCalculator.sum(2, 0.3));
    }
    @Test
    void subtract() {
        assertEquals(10, myCalculator.subtract(12, 2));
        assertEquals(0.3, myCalculator.subtract(12.5, 12.2));
    }
    @Test
    void multiply() {
        assertEquals(5, myCalculator.multiply(2.5, 2));
        assertEquals(5.98, myCalculator.multiply(2.3, 2.6));
    }
    @Test
    void divide() {
        assertEquals(2.5,myCalculator.divide(5,2));
        assertThrows(ArithmeticException.class, () -> myCalculator.divide(1, 0));
    }
}