public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int dif(int a, int b) {
        return a - b;
    }
    public int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    public int times(int a, int b) {
        return a * b;
    }
    public int solver() {
        // Уравнение: (10 + 5) * 2
        int sum = add(10, 5);
        return times(sum, 2);
    }
}
