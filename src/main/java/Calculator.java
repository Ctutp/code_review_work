import java.text.DecimalFormat;
public class Calculator {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public double sum(double firstNumber, double secondNumber) {
        return Double.parseDouble(decimalFormat.format(firstNumber + secondNumber));
    }
    public double subtract(double firstNumber, double secondNumber) {
        return Double.parseDouble(decimalFormat.format(firstNumber - secondNumber));
    }
    public double multiply(double firstNumber, double secondNumber) {
        return Double.parseDouble(decimalFormat.format(firstNumber * secondNumber));
    }
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Dividing by zero is impossible");
        }
        return Double.parseDouble(decimalFormat.format(firstNumber / secondNumber));
    }
    public double solver(){
        double y = 25;
        double x = 34.5;
        return this.sum(y, x);
    }
}