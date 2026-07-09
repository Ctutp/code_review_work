public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) return 0;   // защита от деления на ноль, как в исходном классе
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    // Решение системы: 2x + 3y = 8, 4x - y = 2  →  x=1, y=2  →  возвращает x+y = 3
    public int solver() {
        int a1 = 2, b1 = 3, c1 = 8;
        int a2 = 4, b2 = -1, c2 = 2;

        int determinant = dif(times(a1, b2), times(a2, b1));
        int x = div(dif(times(c1, b2), times(c2, b1)), determinant);
        int y = div(dif(times(a1, c2), times(a2, c1)), determinant);

        return add(x, y);
    }
}
