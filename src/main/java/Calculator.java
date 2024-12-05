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
        int part1 = add(10, 5);
        int part2 = times(part1, 2);
        int part3 = div(20, 4);
        int result = dif(part2, part3);

        return result;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result of solver: " + calculator.solver());
    }
}
