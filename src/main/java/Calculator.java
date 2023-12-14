public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b){
        int multiplication = times(a, b);
        int subtraction = dif(a, b);
        int result = add(multiplication, subtraction);
        return result;
    }
}
