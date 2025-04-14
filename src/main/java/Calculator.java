public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int step1 = add(5, 3);    // 5 + 3 = 8
        int step2 = times(step1, 2); // 8 * 2 = 16
        int step3 = div(8, 4);    // 8 / 4 = 2
        int result = dif(step2, step3); // 16 - 2 = 14
        return result;
    }
}
