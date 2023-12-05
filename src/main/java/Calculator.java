public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }


    public int dif(int a, int b) {
        return a - b;
    }


    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На нолб не делить нельзя");
        }
    }


    public int times(int a, int b) {
        return a * b;
    }


    public int solver() {
        int result = add(10, 2);
        result = times(result, 5);
        return result;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Difference: " + calculator.dif(8, 2));
        System.out.println("Multiplication: " + calculator.times(4, 6));


        try {
            System.out.println("Division: " + calculator.div(10, 2));
            System.out.println("Division by zero: " + calculator.div(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Solver: " + calculator.solver());
    }
}
