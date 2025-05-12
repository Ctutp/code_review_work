import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.println("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /): ");
        operator = scanner.next();

        System.out.println("Введите второе число: ");
        num2 = scanner.nextDouble();

        double result = calculate(num1, num2, operator);
        System.out.println("Результат: " + result);
    }

    public static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error");
                    return 0;
                }
            default:
                System.out.println("Error");
                return 0;
        }
    }
}