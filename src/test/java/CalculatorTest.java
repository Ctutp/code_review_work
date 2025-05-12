

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    private final double DELTA = 0.001; // Погрешность для double-сравнений

    @Test
    void add() {
        // Тест сложения: 5.5 + 2.3 = 7.8
        assertEquals(7.8, Calculator.calculate(5.5, 2.3, "+"), DELTA,
                "Ошибка сложения положительных чисел");

        // Тест с отрицательными числами: -10 + 3 = -7
        assertEquals(-7, Calculator.calculate(-10, 3, "+"), DELTA);
    }

    @Test
    void dif() {
        // Тест вычитания: 15.7 - 5.2 = 10.5
        assertEquals(10.5, Calculator.calculate(15.7, 5.2, "-"), DELTA);

        // Тест с нулём: 0 - (-8.4) = 8.4
        assertEquals(8.4, Calculator.calculate(0, -8.4, "-"), DELTA);
    }

    @Test
    void div() {
        // Нормальное деление: 20 / 4 = 5
        assertEquals(5, Calculator.calculate(20, 4, "/"), DELTA);


        // Деление с остатком: 10 / 3 ≈ 3.333
        assertEquals(3.333, Calculator.calculate(10, 3, "/"), DELTA);
    }

    @Test
    void times() {
        // Умножение положительных: 3 * 2.5 = 7.5
        assertEquals(7.5, Calculator.calculate(3, 2.5, "*"), DELTA);

        // Умножение на ноль: -5 * 0 = 0
        assertEquals(0, Calculator.calculate(-5, 0, "*"), DELTA);
    }

    @Test
    void solver() {
        // Комплексный тест с разными операциями
        assertEquals(14.8, Calculator.calculate(
                Calculator.calculate(10, 2, "+"), // 12
                Calculator.calculate(7, 5, "-"),   // 2 → 12 * 2 = 24
                "*"), DELTA);

        // Тест с цепочкой вычислений: ((15/3) - 2) * 4 = 12
        double step1 = Calculator.calculate(15, 3, "/");
        double step2 = Calculator.calculate(step1, 2, "-");
        assertEquals(12, Calculator.calculate(step2, 4, "*"), DELTA);
    }
}
