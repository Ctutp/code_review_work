import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-5, calc.dif(0, 5));
        assertEquals(5, calc.dif(5, 0));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
        assertEquals(0, calc.div(0, 5));
        assertEquals(0, calc.div(5, 0));   // вместо исключения возвращается 0
    }

    @Test
    void times() {
        assertEquals(6, calc.times(2, 3));
        assertEquals(0, calc.times(0, 5));
        assertEquals(-10, calc.times(-2, 5));
    }

    @Test
    void solver() {
        // solver() решает систему 2x+3y=8, 4x-y=2, возвращает x+y = 3
        assertEquals(3, calc.solver());
    }
}
