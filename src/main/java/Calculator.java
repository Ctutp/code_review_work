public class Calculator {
  public int add(int a, int b) {
        int result = a + b;
        return result;
    }
    public int dif(int a, int b) {
        return a - b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public int times(int a, int b) {
        return a * b;
    }
    public int solver() {
        // Уравнение: (50 - 10) / 4 + 5
        int difference = dif(50, 10);
        int division = div(difference, 4);
        return add(division, 5);
    }
}
