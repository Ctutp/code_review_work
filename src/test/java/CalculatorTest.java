import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
      assertEquals(calculator.add(80, -70), calculator.add(4,6));
      assertTrue(calculator.add(7, -3) > 0);
      assertNotNull(calculator.add(1, -1));
    }

    @Test
    void dif() {
        assertEquals(calculator.dif(80, -70), calculator.dif(200,50));
        assertTrue(calculator.dif(8, 20) < 0);
        assertNotNull(calculator.dif(1, -1));
    }

    @Test
    void div() {
        assertEquals(calculator.div(80, -10), calculator.div(-16,2));
        assertTrue(calculator.div(7, -3) < 0);
        assertNotNull(calculator.div(1, -1));
    }

    @Test
    void times() {
        assertEquals(calculator.times(80, -70), calculator.times(-56,100));
        assertTrue(calculator.times(7, -3) < 0);
        assertNotNull(calculator.times(1, -1));    }

    @Test
    void solver() {
        assertTrue(calculator.solver() != 1);
        assertNotNull(calculator.solver());    }
}