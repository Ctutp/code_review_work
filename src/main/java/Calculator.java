public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int a = 10;
        int b = 5;

        int sum = add(a, b);
        int difference = dif(a, b);
        int product = times(a, b);
        int quotient = div(a, b);

        return sum + difference + product + quotient;
    }
}
