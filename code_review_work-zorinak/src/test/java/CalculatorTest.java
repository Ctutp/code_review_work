import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    // D:/YandexDisk/_МИИТ/III Курс/Инструментальные ср-ва разработки/visualvm_22/bin/visualvm.exe
    Calculator calculator = new Calculator();

    // Добавление
    @Test
    void add() {
        assertEquals(3, calculator.add(1,2));
    }

    // Удаление
    @Test
    void dif() {
        assertEquals(11, calculator.dif(14,3));
    }

    // Деление
    @Test
    void div() {
        assertEquals(4, calculator.div(12,3));
    }

    // Степень
    @Test
    void times() {
        assertEquals(1024, calculator.div(2,10));
    }

    @Test
    void solver() {
        assertEquals(19, calculator.solver());
    }
}