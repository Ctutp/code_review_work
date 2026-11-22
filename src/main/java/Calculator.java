public class Calculator {
    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public int dif(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public int solver() {
        int sum = add(10, 5);
        int product = times(sum, 2);
        int difference = dif(product, 6);
        return div(difference, 3);
    }
}
